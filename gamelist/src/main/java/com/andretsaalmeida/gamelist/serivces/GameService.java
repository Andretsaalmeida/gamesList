package com.andretsaalmeida.gamelist.serivces;

import com.andretsaalmeida.gamelist.dto.GameDTO;
import com.andretsaalmeida.gamelist.dto.GameMinDTO;
import com.andretsaalmeida.gamelist.entities.Game;
import com.andretsaalmeida.gamelist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository; // Assuming you have a GameRepository interface for data access

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true) // Ensures the method is executed within a read-only transaction
    public GameDTO findById(Long id) {
        // This method should return a GameDTO object based on the provided ID.
        // For now, we will return a new GameDTO with default values.
        Game game = gameRepository.findById(id).orElseThrow(() -> new RuntimeException("Game not found"));
        GameDTO gameDTO = GameDTO.fromEntity(game);
        return gameDTO;
    }

    public List<GameMinDTO> findAll() {
        // This method should return a list of GameMinDTO objects.
        // For now, we will return an empty list.
        List<Game> result = gameRepository.findAll();
        // Convert the list of Game entities to a list of GameMinDTO objects
        // using the static fromEntity method in GameMinDTO.

        return result.stream()
                .map(GameMinDTO::new).toList();

    }
}
