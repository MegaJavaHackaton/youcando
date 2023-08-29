package com.megajava.youcando.gamerecommendation;

import com.megajava.youcando.question.GameRepository;
import com.megajava.youcando.question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameRecommendationService {

    private final GameRecommendationRepository recommendationRepository;
    private final QuestionService questionService;

    @Autowired
    public GameRecommendationService(GameRecommendationRepository recommendationRepository, QuestionService questionService) {
        this.recommendationRepository = recommendationRepository;
        this.questionService = questionService;
    }

    public GameRecommendationDTO getRecommendedGamesByMBTI(String mbtiResult) {
        String finalResult = questionService.resultMapping(mbtiResult);

        // finalResult 값을 기반으로 게임 추천 정보를 가져오는 로직 추가
        List<GameRecommendation> recommendations = recommendationRepository.findAllByFinalResult(finalResult);
        List<String> recommendedGameNames = recommendations.stream()
                .map(recommendation -> recommendation.getGame().getName())
                .collect(Collectors.toList());

        return new GameRecommendationDTO(recommendedGameNames.toArray(new String[0]));
    }

}
