package com.example.service;

import com.example.collection.Player;
import com.example.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlayerService {

    @Autowired
    private IPlayerRepository iPlayerRepository;

    public Flux<Player> ObtenerJugadoresMayoresA35(){
        Flux<Player> playerList = findAllPlayers();
        return playerList.filter(player -> player.age >= 35 );
    }

    public Mono<Player> savePlayer (Player p){
        return this.iPlayerRepository.save(p);
    }

    public Flux<Player> findAllPlayers() {
        return this.iPlayerRepository.findAll();
    }

    public Mono<Player> findPlayerById(String id){
        return this.iPlayerRepository.findById(id);
    }


}
