package io.github.rodrigobarr0s.dslist.services;

import io.github.rodrigobarr0s.dslist.dto.GameDTO;
import io.github.rodrigobarr0s.dslist.dto.GameMinDTO;
import io.github.rodrigobarr0s.dslist.entities.Game;
import io.github.rodrigobarr0s.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return repository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = repository.findById(id).orElseThrow(() -> new NoSuchElementException("Game not found!"));
        return new GameDTO(game);
    }
}
