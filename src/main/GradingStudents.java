package main;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = List.of(73, 67, 38, 33);
        System.out.println(gradingStudents(grades));
    }

    public static int checkMultipleOfFive(int grade) {
        int nextMultipleOfFive = ((grade / 5) + 1) * 5;

        if (nextMultipleOfFive - grade < 3) {
            return nextMultipleOfFive;
        } else {

            return grade;
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(GradingStudents::apply).collect(Collectors.toList());
    }

    private static Integer apply(Integer grade) {
        if (grade < 38) {
            return grade;
        } else {
            return checkMultipleOfFive(grade);
        }
    }
}
