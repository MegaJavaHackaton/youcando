package com.megajava.youcando.gamerecommendation;

public class GameRecommendationDTO {
    private String[] recommendedGames;

    public GameRecommendationDTO(String[] recommendedGames) {
        this.recommendedGames = recommendedGames;
    }

    public String[] getRecommendedGames() {
        return recommendedGames;
    }

    public void setRecommendedGames(String[] recommendedGames) {
        this.recommendedGames = recommendedGames;
    }
}

