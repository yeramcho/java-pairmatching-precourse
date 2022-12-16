package pairmatching.model;

import java.util.Arrays;

public enum Mission {
    CAR_RACE(Level.LEVEL1, "자동차경주"),
    LOTTO(Level.LEVEL1, "로또"),
    BASEBALL(Level.LEVEL1, "숫자야구게임"),
    SHOPPING_BASKET(Level.LEVEL2, "장바구니"),
    PAYMENT(Level.LEVEL2, "결제"),
    SUBWAY(Level.LEVEL2, "지하철노선도"),
    IMPROVEMENT(Level.LEVEL4, "성능개선"),
    DEPLOYMENT(Level.LEVEL4, "배포");

    private Level level;
    private String name;

    Mission(Level level, String name) {
        this.level = level;
        this.name = name;
    }

    public Level getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

}
