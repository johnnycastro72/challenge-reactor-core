package com.example.service;

import com.example.demo.Player;
import reactor.core.publisher.Flux;

public class PlayerService {

    public Flux<Player> ObtenerJugadoresMayoresA35(Flux<Player> playerList){
        return playerList.filter(player -> player.age >= 35 );
    }
}
