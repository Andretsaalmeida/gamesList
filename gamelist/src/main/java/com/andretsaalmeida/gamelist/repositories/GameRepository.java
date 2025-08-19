package com.andretsaalmeida.gamelist.repositories;


import com.andretsaalmeida.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

    // This class can be extended to add custom methods if needed.
    // For now, it inherits all CRUD operations from JpaRepository.
}
