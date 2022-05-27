package com.example.service;

import com.example.collection.Player;
import com.example.dto.PlayerDTO;
import com.example.repository.IPlayerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlayerService {

    @Autowired
    private IPlayerRepository iPlayerRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Flux<Player> ObtenerJugadoresMayoresA35(){
        return playerList.filter(player -> player.age >= 35 );
    }

    public Mono<PlayerDTO> savePlayer (PlayerDTO p){
        return this.iPlayerRepository.save(convertDTOToEntity(p)).map(playerDto -> convertEntityToDTO(playerDto));
    }

    public Flux<PlayerDTO> findAllPlayers() {
        return this.iPlayerRepository.findAll().map( p -> convertEntityToDTO(p));
    }

    public Mono<PlayerDTO> findPlayerById(Integer id){
        return this.iPlayerRepository.findById(id).map(p -> convertEntityToDTO(p) );
    }


    //Converters
    public PlayerDTO convertEntityToDTO(Player p){
        return modelMapper.map(p, PlayerDTO.class);
    }

    public Player convertDTOToEntity (PlayerDTO pdto){
        return modelMapper.map(pdto,Player.class);
    }

}
