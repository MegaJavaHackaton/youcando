package com.megajava.youcando.question;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game_list")
public class Game {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "info")
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
// Getter, Setter, 생성자 등
}

