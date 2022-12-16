package pairmatching.view;

import pairmatching.model.Course;
import pairmatching.model.Level;
import pairmatching.model.Mission;
import pairmatching.model.Table;

import java.util.List;

public class OutputView {
    public static void selectFunction() {
        System.out.println(ProgramMessage.SELECT_FUNCTION.getMessage());
        System.out.println(ProgramMessage.OPTIONS.getMessage());
    }

    public static void showAllInfos() {
        System.out.println();
        System.out.println(Table.LINE.getSign());
        printCourse();
        printLevel();
        System.out.println(Table.LINE.getSign());
    }

    private static void printCourse() {
        System.out.print(Table.COURSE.getSign() + Table.DEFINE.getSign());
        StringBuilder sb = new StringBuilder();
        Course[] courses = Course.values();
        for (int i = 0; i < courses.length; i++) {
            if (i > 0) {
                sb.append(Table.DELIMITER.getSign());
            }
            sb.append(courses[i].getName());
        }
        System.out.println(sb);
    }

    private static void printLevel() {
        System.out.println(Table.MISSION.getSign() + Table.DEFINE.getSign());
        StringBuilder sb;
        for (Level level : Level.values()) {
            sb = new StringBuilder();
            sb.append(Table.LIST.getSign())
                    .append(level.getName())
                    .append(Table.DEFINE.getSign());
            printMission(sb, level);
            System.out.println(sb);
        }
    }

    private static void printMission(StringBuilder sb, Level level) {
        List<Mission> missions = level.getMission();
        for (int i = 0; i < missions.size(); i++) {
            if (i > 0) {
                sb.append(Table.DELIMITER.getSign());
            }
            sb.append(missions.get(i).getName());
        }
    }
}
