package com.andretsaalmeida.gamelist.dto;

import com.andretsaalmeida.gamelist.entities.GameList;

public record GameListDTO(Long id, String name) {
    public static GameListDTO fromEntity(GameList entity) {
        return new GameListDTO(entity.getId(), entity.getName());
    }
}
