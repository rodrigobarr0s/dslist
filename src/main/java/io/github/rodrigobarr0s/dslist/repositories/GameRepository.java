package io.github.rodrigobarr0s.dslist.repositories;

import io.github.rodrigobarr0s.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
