package com.megajava.youcando.group;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {

    // 추가적인 메서드를 선언할 수 있습니다.
}