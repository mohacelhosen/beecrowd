import java.util.Scanner;
public class Q1008_Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empNumber = in.nextInt();
        int workedHours = in.nextInt();
        double perHour = in.nextDouble();
        double salary = workedHours * perHour;
        System.out.printf("NUMBER = %d\n", empNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
