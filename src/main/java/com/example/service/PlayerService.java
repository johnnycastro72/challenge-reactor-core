package com.example.service;

import com.example.collection.Player;
import com.example.repository.IPlayerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PlayerService {

    @Autowired
    private IPlayerRepository iPlayerRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Flux<Player> ObtenerJugadoresMayoresA35(Flux<Player> playerList){
        return playerList.filter(player -> player.age >= 35 );
    }

}
