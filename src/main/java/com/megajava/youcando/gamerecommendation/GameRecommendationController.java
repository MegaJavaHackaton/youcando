package com.megajava.youcando.gamerecommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GameRecommendationController {

    private final GameRecommendationService recommendationService;

    @Autowired
    public GameRecommendationController(GameRecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping("/recommendations/{mbtiResult}")
    public ResponseEntity<GameRecommendationDTO> getRecommendations(@PathVariable String mbtiResult) {
        GameRecommendationDTO recommendations = recommendationService.getRecommendedGamesByMBTI(mbtiResult);
        if (recommendations != null) {
            return ResponseEntity.ok(recommendations);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

