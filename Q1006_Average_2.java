import java.util.Scanner;
public class Q1006_Average_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        double A_weight = 2;
        double B_weight = 3;
        double C_weight = 5;

        double average = ((A*A_weight)+(B*B_weight)+(C*C_weight))/(A_weight+B_weight+C_weight);
        System.out.printf("MEDIA = %.1f\n",average);
    }
}
