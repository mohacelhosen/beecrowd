import java.util.Scanner;

public class Q1014_Consumption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distance = in.nextInt();
        double fuel  = in.nextDouble();
        double consumption = distance/fuel;
        System.out.printf("%.3f km/l\n",consumption);
    }
}
