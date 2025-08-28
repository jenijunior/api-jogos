package com.devjeni.apigames.repositories;

import com.devjeni.apigames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
