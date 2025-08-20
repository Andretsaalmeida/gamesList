package com.andretsaalmeida.gamelist.controllers;

import com.andretsaalmeida.gamelist.dto.GameDTO;
import com.andretsaalmeida.gamelist.dto.GameMinDTO;
import com.andretsaalmeida.gamelist.serivces.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }
//    public GameMinDTO findById(@PathVariable Long id) {
//        GameMinDTO result = gameService.findAll().stream()
//                .filter(game -> game.getId().equals(id))
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("Game not found with id: " + id));
//        return result;
//    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
