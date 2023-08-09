package easy.NumberLineJumps;

public class NumberLineJumps {
    public static void main(String[] args) {
        int x1 = 4181;
        int v1 = 3976;
        int x2 = 6312;
        int v2 = 988;

        System.out.println(kangaroo(x1, v1, x2, v2));

    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int xx1 = x1;
        int xx2 = x2;
        if ((x1 + v1) == (x2 + v2)) {
            return "YES";
        }

        for (int i = 0; i < 9999; i++) {
            xx1 += v1;
            xx2 += v2;

            if (xx1 == xx2){
                return "YES";
            }
        }

        return "NO";
    }
}
