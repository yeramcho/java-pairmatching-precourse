package pairmatching.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class LevelTest {

    @DisplayName("해당 레벨의 미션 반환")
    @Test
    void returnMissions() {
        for (Level level : Level.values()) {
            List<Mission> missions = Arrays.stream(Mission.values())
                    .filter(m -> m.getLevel().equals(level))
                    .collect(Collectors.toList());
            assertThat(level.getMission())
                    .containsAll(missions);
        }
    }
}
