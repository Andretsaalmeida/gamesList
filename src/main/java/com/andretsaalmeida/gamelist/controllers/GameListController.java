package com.andretsaalmeida.gamelist.controllers;

import com.andretsaalmeida.gamelist.dto.GameListDTO;
import com.andretsaalmeida.gamelist.dto.GameMinDTO;
import com.andretsaalmeida.gamelist.serivces.GameListService;
import com.andretsaalmeida.gamelist.serivces.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    private final GameListService gameListService;

    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        GameListDTO result = gameListService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByGamesList(listId);
        return result;
    }

}
