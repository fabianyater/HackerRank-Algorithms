package main;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>(List.of(-2, 2, 1));
        List<Integer> oranges = new ArrayList<>(List.of(5, -6));

        countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int applesCounter = countFruits(s, t, a, apples);
        int orangesCounter = countFruitsStream(s, t, b, oranges);

        System.out.println(applesCounter);
        System.out.println(orangesCounter);
    }

    public static int countFruits(int s, int t, int treePosition, List<Integer> fruits) {
        int counter = 0;

        for (int fruit : fruits) {
            int sum = treePosition + fruit;

            if (sum >= s && sum <= t) {
                counter++;
            }
        }

        return counter;
    }

    public static int countFruitsStream(int s, int t, int treePosition, List<Integer> fruits) {

        return (int) fruits
                .stream()
                .map(fruit -> treePosition + fruit)
                .filter(sum -> sum >= s && sum <= t)
                .count();
    }

}
