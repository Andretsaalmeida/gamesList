package com.andretsaalmeida.gamelist.repositories;


import com.andretsaalmeida.gamelist.entities.Game;
import com.andretsaalmeida.gamelist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    // This class can be extended to add custom methods if needed.
    // For now, it inherits all CRUD operations from JpaRepository.
    @Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS gameYear, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.game_list_id = :listId
			ORDER BY tb_belonging.position
			""")
	List<GameMinProjection> searchByList(Long listId);
}
