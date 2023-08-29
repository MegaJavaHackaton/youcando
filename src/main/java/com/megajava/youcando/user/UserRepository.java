package com.megajava.youcando.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // 여기에 사용자와 관련된 추가적인 메서드를 선언할 수 있습니다.

    // 사용자를 생성하고 저장하는 메서드
    User save(User user);

    // 사용자 ID를 통해 사용자 정보를 조회하는 메서드
    Optional<User> findById(Long id);

    // 사용자 그룹 ID를 업데이트하는 메서드
    @Modifying
    @Query("UPDATE User u SET u.groupId = :groupId WHERE u.id = :userId")
    void updateGroupId(@Param("userId") Long userId, @Param("groupId") int groupId);

    void setGroupId(String finalResult);

    // 이 외에도 필요한 메서드를 추가로 선언할 수 있습니다.
}

