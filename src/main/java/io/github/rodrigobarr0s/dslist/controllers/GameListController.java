package io.github.rodrigobarr0s.dslist.controllers;

import io.github.rodrigobarr0s.dslist.dto.GameListDTO;
import io.github.rodrigobarr0s.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        List<GameListDTO> gameList = service.findAll();
        return ResponseEntity.ok().body(gameList);
    }
}
