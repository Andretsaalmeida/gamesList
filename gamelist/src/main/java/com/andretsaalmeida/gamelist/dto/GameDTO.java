package com.andretsaalmeida.gamelist.dto;

import com.andretsaalmeida.gamelist.entities.Game;
import lombok.Value;

@Value
public class GameDTO {

    Long id;
    String title;
    Integer year;
    String genre;
    String platforms;
    Double score;
    String imgUrl;
    String shortDescription;
    String longDescription;

    public GameDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.genre = entity.getGenre();
        this.platforms = entity.getPlatforms();
        this.score = entity.getScore();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.longDescription = entity.getLongDescription();
    }

    public static GameDTO fromEntity(Game game) {
        if (game == null) {
            return null;
        }
        return new GameDTO(game);
    }
}
