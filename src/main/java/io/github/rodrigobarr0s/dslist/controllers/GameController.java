package io.github.rodrigobarr0s.dslist.controllers;

import io.github.rodrigobarr0s.dslist.dto.GameDTO;
import io.github.rodrigobarr0s.dslist.dto.GameMinDTO;
import io.github.rodrigobarr0s.dslist.entities.Game;
import io.github.rodrigobarr0s.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll() {
        List<GameMinDTO> games = service.findAll();
        return ResponseEntity.ok().body(games);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GameDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
