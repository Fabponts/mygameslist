package com.fabpont.mygameslist.repositories;

import com.fabpont.mygameslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}

