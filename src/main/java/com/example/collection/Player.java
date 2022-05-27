package com.example.collection;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document(collection="player")
public class Player {
    @Id
    public int id;
    public String name;
    public int age;
    public String icon;
    public String national;
    public int winners;
    public int games;
    public String club;

    public Player(){

    }

    public Player(int id, String name, int age, String icon, String national, int winners, int games, String club) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.icon = icon;
        this.national = national;
        this.winners = winners;
        this.games = games;
        this.club = club;
    }

}
