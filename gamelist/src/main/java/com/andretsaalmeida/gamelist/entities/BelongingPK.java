package com.andretsaalmeida.gamelist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_list_id")
    private GameList gameList;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
}
