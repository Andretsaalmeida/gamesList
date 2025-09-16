package com.andretsaalmeida.gamelist.serivces;

import com.andretsaalmeida.gamelist.dto.GameDTO;
import com.andretsaalmeida.gamelist.dto.GameMinDTO;
import com.andretsaalmeida.gamelist.entities.Game;
import com.andretsaalmeida.gamelist.projections.GameMinProjection;
import com.andretsaalmeida.gamelist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true) // Ensures the method is executed within a read-only transaction
    public GameDTO findById(@PathVariable Long listId) {
        Game game = gameRepository.findById(listId).orElseThrow(() -> new RuntimeException("Jogo não encontrado"));
        return GameDTO.fromEntity(game);
    }

    @Transactional
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        // Convert the list of Game entities to a list of GameMinDTO objects
        // using the static fromEntity method in GameMinDTO.
        return result.stream()
                .map(GameMinDTO::fromEntity)
                .toList();

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByGamesList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games. stream()
                .map(GameMinDTO::fromProjection)
                .toList();
        }
}
