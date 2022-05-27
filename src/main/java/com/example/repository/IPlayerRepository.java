package com.example.repository;


import com.example.collection.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerRepository extends ReactiveMongoRepository<Player, Integer> {
}
