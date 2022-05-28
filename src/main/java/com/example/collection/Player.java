package com.example.collection;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@Document(collection="player")
public class Player {
    @Id
    public String _id;
    public int id;
    public String name;
    public int age;
    public String icon;
    public String national;
    public int winners;
    public int games;
    public String club;

    Player() {

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

    @Override
    public String toString() {
        return "Player{" +
                "_id='" + _id + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", icon='" + icon + '\'' +
                ", national='" + national + '\'' +
                ", winners=" + winners +
                ", games=" + games +
                ", club='" + club + '\'' +
                '}';
    }
}
