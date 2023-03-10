import java.util.Scanner;
public class Q1017_Fuel_Spent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours = in.nextInt();
        int speeds = in.nextInt();
        double fuel_needed = (double)(hours*speeds)/12;
        System.out.printf("%.3f\n",fuel_needed);
    }
}
