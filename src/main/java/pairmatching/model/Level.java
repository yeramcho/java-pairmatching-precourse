package pairmatching.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private String name;

    Level(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Mission> getMission() {
        return Arrays.stream(Mission.values())
                .filter(m -> m.getLevel().equals(this))
                .collect(Collectors.toList());
    }
}
