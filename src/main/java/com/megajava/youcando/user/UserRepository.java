package com.megajava.youcando.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;
    public void setResult(String finalResult) {
        User user = new User();
        user.setResult(finalResult);
        em.persist(user);
    }
}
