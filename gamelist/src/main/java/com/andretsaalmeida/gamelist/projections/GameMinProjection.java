package com.andretsaalmeida.gamelist.projections;

// Projection interface for a minimal representation of a game entity
//get methods corresponding to the SQL query
public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
}
