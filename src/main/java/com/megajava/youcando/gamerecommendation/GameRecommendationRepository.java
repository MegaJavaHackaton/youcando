package com.megajava.youcando.gamerecommendation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRecommendationRepository extends JpaRepository<GameRecommendation, String> {
    List<GameRecommendation> findAllByFinalResult(String finalResult);
}

