package com.andretsaalmeida.gamelist.dto;

import com.andretsaalmeida.gamelist.entities.GameList;
import lombok.Value;

@Value
public class GameListDTO {
    Long id;
    String name;

    public static GameListDTO fromEntity(GameList entity) {
        return new GameListDTO(entity.getId(), entity.getName());
    }
}
