package com.example.service;

import com.example.demo.Player;
import reactor.core.publisher.Flux;

public class PlayerService {

    public Flux<Player> ObtenerJugadoresMayoresA35(Flux<Player> lista){
        return lista.filter(player -> player.age >= 35 );
    }
}
