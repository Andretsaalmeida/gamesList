package com.andretsaalmeida.gamelist.dto;

import com.andretsaalmeida.gamelist.entities.Game;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
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
        BeanUtils.copyProperties(entity, this);
    }

    public static GameDTO fromEntity(Game game) {
        if (game == null) {
            return null;
        }
        return new GameDTO(game);
    }


}
