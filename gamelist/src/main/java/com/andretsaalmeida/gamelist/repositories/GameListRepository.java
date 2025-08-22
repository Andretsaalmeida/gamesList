package com.andretsaalmeida.gamelist.repositories;

import com.andretsaalmeida.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

//    // Custom query to find all game lists with their games
//    @Query("SELECT gl FROM GameList gl JOIN FETCH gl.games")
//    List<GameList> findAllWithGames();
//
//    // Custom query to find a game list by its name
//    Optional<GameList> findByName(String name);
}
