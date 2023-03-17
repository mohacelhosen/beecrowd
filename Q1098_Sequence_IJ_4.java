public class Q1098_Sequence_IJ_4 {
    public static void main(String[] args) {
        double i, j;

        for (i = 0; i <= 2; i += 0.2) {
            for (j = 1 + i; j <= 3 + i; j++) {
                if (i == 0 || i == 1 || i >= 1.9) {
                    System.out.printf("I=%.0f J=%.0f\n", i, j);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, j);
                }
            }
        }
    }
}
