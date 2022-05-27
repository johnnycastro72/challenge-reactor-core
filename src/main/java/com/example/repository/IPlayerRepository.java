package com.example.repository;

import com.example.demo.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerRepository extends ReactiveMongoRepository<Player, Integer> {
}
