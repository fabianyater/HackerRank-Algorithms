package easy.BreakingTheRecords;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        System.out.println(breakingRecords(scores));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int countBreakingMinRecords = 0;
        int countBreakingMaxRecords = 0;
        List<Integer> result = new ArrayList<>();

        for (Integer score : scores) {
            if (score < minScore) {
                minScore = score;
                countBreakingMinRecords++;
            }

            if (score > maxScore) {
                maxScore = score;
                countBreakingMaxRecords++;
            }
        }

        result.add(countBreakingMaxRecords);
        result.add(countBreakingMinRecords);

        return result;
    }
}
