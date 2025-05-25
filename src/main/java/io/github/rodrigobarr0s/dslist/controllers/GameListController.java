package io.github.rodrigobarr0s.dslist.controllers;

import io.github.rodrigobarr0s.dslist.dto.GameListDTO;
import io.github.rodrigobarr0s.dslist.dto.GameMinDTO;
import io.github.rodrigobarr0s.dslist.services.GameListService;
import io.github.rodrigobarr0s.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        List<GameListDTO> gameList = service.findAll();
        return ResponseEntity.ok().body(gameList);
    }

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> searchByList(@PathVariable Long listId) {
        List<GameMinDTO> lists = gameService.searchByList(listId);
        return ResponseEntity.ok().body(lists);
    }
}
