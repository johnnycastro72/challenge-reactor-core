package com.example.controller;


import com.example.collection.Player;
import com.example.dto.PlayerDTO;
import com.example.repository.IPlayerRepository;
import com.example.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @Autowired
    IPlayerRepository playerRepository;


    @GetMapping("/listas")
    public Flux<PlayerDTO> getListasRankingPlayers() {
        return playerService.ObtenerJugadoresMayoresA35();
    }

    @GetMapping
    public Flux<PlayerDTO> getFilteredPlayers() {
        return playerService.findAllPlayers();
    }



}
