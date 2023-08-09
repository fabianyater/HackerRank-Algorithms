package easy.BreakingTheRecords;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1));

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
