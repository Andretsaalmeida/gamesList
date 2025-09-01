package com.andretsaalmeida.gamelist.dto;

import com.andretsaalmeida.gamelist.entities.Game;

import com.andretsaalmeida.gamelist.projections.GameMinProjection;
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

    public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription, Double score) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.score = score;
    }

    public static GameMinDTO fromEntity(Game game) {
        if (game == null) {
            return null;
        }
        return new GameMinDTO(game);
    }

    public static GameMinDTO fromProjection(GameMinProjection gameMinProjection) {
        if (gameMinProjection == null) {
            return null;
        }
        return new GameMinDTO(
                gameMinProjection.getId(),
                gameMinProjection.getTitle(),
                gameMinProjection.getGameYear(),
                gameMinProjection.getImgUrl(),
                gameMinProjection.getShortDescription(),
                null);
    }
}
