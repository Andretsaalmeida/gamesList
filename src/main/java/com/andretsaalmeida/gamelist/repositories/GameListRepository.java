package com.andretsaalmeida.gamelist.repositories;

import com.andretsaalmeida.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE Belonging b " +
            "SET b.position = :newPosition " +
            "WHERE b.id.gameList.id = :gameListId AND b.id.game.id = :gameId")
    void updateBelongingPosition(
            @Param("gameListId") Long gameListId,
            @Param("gameId") Long gameId,
            @Param("newPosition") int newPosition);
}
