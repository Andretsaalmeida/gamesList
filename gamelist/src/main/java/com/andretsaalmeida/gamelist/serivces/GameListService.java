package com.andretsaalmeida.gamelist.serivces;

import com.andretsaalmeida.gamelist.dto.GameListDTO;
import com.andretsaalmeida.gamelist.dto.GameMinDTO;
import com.andretsaalmeida.gamelist.entities.Game;
import com.andretsaalmeida.gamelist.entities.GameList;
import com.andretsaalmeida.gamelist.repositories.GameListRepository;
import com.andretsaalmeida.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    private final GameRepository gameRepository;

    public GameListService(GameListRepository gameListRepository, GameRepository gameRepository) {
        this.gameListRepository = gameListRepository;
        this.gameRepository = gameRepository;
    }
    /**
     * Retrieves all games from the repository and maps them to GameMinDTO.
     *
     * @return a list of GameMinDTO objects representing all games.
     */
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream()
                .map(GameListDTO::fromEntity) // Assuming you have a static method fromEntity in GameMinDTO
                .toList(); // Collect the results into a List<GameMinDTO>

        //return result.stream().map(GameListDTO::new).toList();

    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList result = gameListRepository.findById(id).orElseThrow();
        return GameListDTO.fromEntity(result);
    }
}
