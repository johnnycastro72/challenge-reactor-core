package com.example.controller;


import com.example.collection.Player;
import com.example.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/listas")
    public Flux<Player> getListasRankingPlayers() {
        return playerService.ObtenerJugadoresMayoresA35();
    }

    @GetMapping
    public Flux<Player> getFilteredPlayers() {
        return playerService.findAllPlayers();
    }

    //POST
    @PostMapping("/save/player")
    private Mono<Player> guardarPaciente(@RequestBody Player p){
        return this.playerService.savePlayer(p);
    }




}
