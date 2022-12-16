package pairmatching.view;

import pairmatching.model.Course;
import pairmatching.model.Table;

public class OutputView {
    public static void selectFunction() {
        System.out.println(ProgramMessage.SELECT_FUNCTION.getMessage());
        System.out.println(ProgramMessage.OPTIONS.getMessage());
    }

    public static void showAllInfos() {
        System.out.println();
        System.out.println(Table.LINE.getSign());
        printCourse();

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
}
