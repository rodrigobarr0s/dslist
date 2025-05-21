package io.github.rodrigobarr0s.dslist.services;

import io.github.rodrigobarr0s.dslist.dto.GameMinDTO;
import io.github.rodrigobarr0s.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        return repository.findAll().stream().map(GameMinDTO::new).toList();
    }
}
