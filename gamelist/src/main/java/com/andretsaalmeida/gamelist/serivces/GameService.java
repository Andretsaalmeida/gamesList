package com.andretsaalmeida.gamelist.serivces;

import com.andretsaalmeida.gamelist.dto.GameMinDTO;
import com.andretsaalmeida.gamelist.entities.Game;
import com.andretsaalmeida.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository; // Assuming you have a GameRepository interface for data access

    public List<GameMinDTO> findAll() {
        // This method should return a list of GameMinDTO objects.
        // For now, we will return an empty list.
        List<Game> result= gameRepository.findAll();
        // Convert the list of Game entities to a list of GameMinDTO objects
        // using the static fromEntity method in GameMinDTO.

        return result.stream()
                .map(GameMinDTO::new).toList();

    }
}
