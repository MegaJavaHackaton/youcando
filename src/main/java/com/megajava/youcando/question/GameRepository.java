package com.megajava.youcando.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, String> {
    // 추가적인 메소드 선언 (필요한 경우)
}

