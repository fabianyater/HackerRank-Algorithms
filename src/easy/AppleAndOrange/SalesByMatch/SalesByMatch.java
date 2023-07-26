package easy.AppleAndOrange.SalesByMatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>(List.of(1, 2, 1, 12));

        System.out.println(sockMerchant(4, ar));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> colorCount = new HashMap<>();
        int pairs = 0;

        // Count the occurrences of each color
        for (int color : ar) {
            if (colorCount.containsKey(color)) {
                colorCount.put(color, colorCount.get(color) + 1);
            } else {
                colorCount.put(color, 1);
            }
        }

        // Calculate the number of pairs
        for (int count : colorCount.values()) {
            pairs += count / 2;
        }

        return pairs;
    }

    public static int countNumbers(int number, List<Integer> ar) {
        return (int) ar.stream().filter(item -> item.equals(number)).count();
    }
}
