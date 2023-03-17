import java.util.Scanner;

public class Q1079_Weighted_Averages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  test = in.nextInt();
        for(int i=0; i<test; i++){
            float x = in.nextFloat();
            float y = in.nextFloat();
            float z = in.nextFloat();
            float avg = ((2 * x) + (3 * y) + (5 * z)) / (float)(2 + 3 + 5);
            System.out.printf("%.1f\n",avg);
        }
    }
}
