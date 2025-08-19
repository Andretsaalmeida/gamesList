package com.andretsaalmeida.gamelist.dto;

import com.andretsaalmeida.gamelist.entities.Game;

import lombok.Value;

@Value
public class GameMinDTO {
    Long id;
    String title;
    Integer year;
    String imgUrl;
    String shortDescription;
    Double score;

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.score = entity.getScore();
    }

    public static Object fromEntity(Game game) {
        if (game == null) {
            return null;
        }
        return new GameMinDTO(game);
    }
}
