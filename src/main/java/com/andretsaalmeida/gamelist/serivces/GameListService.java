package com.andretsaalmeida.gamelist.serivces;

import com.andretsaalmeida.gamelist.dto.GameListDTO;
import com.andretsaalmeida.gamelist.entities.GameList;
import com.andretsaalmeida.gamelist.projections.GameMinProjection;
import com.andretsaalmeida.gamelist.repositories.GameListRepository;
import com.andretsaalmeida.gamelist.repositories.GameRepository;
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
                .map(GameListDTO::fromEntity)
                .toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList result = gameListRepository.findById(id).orElseThrow();
        return GameListDTO.fromEntity(result);
    }

    @Transactional
    public void move(Long gameListId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(gameListId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(gameListId, list.get(i).getId(), i);
        }
    }

}
