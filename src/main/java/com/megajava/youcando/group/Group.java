package com.megajava.youcando.group;

import com.megajava.youcando.gamerecommendation.GameRecommendation;
import com.megajava.youcando.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group")
@Getter
@Setter
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private int groupId;

    private String name;
    private String info;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

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

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<GameRecommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<GameRecommendation> recommendations) {
        this.recommendations = recommendations;
    }

    @OneToMany(mappedBy = "group")
    private List<User> user;

    @OneToMany(mappedBy = "group")
    private List<GameRecommendation> recommendations;

    // 추가 필드 및 메서드를 정의할 수 있습니다.
}
