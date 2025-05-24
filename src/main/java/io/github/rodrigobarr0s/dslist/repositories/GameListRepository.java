package io.github.rodrigobarr0s.dslist.repositories;

import io.github.rodrigobarr0s.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
