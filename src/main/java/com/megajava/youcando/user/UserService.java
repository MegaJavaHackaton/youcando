package com.megajava.youcando.user;

import com.megajava.youcando.group.Group;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager em;

    @Transactional
    public void setGroupId(Group finalResult) {
        User user = new User();
        user.setGroupId(finalResult); // Assuming you have a setGroupId method in User entity
        em.persist(user);
    }
}

