package com.andretsaalmeida.gamelist.dto;

import com.andretsaalmeida.gamelist.entities.Game;
import com.andretsaalmeida.gamelist.projections.GameMinProjection;

public record GameMinDTO(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription,
        Double score
) {

    public GameMinDTO(Game entity) {
        this(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getImgUrl(),
                entity.getShortDescription(),
                entity.getScore()
        );
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
                null
        );
    }
}
