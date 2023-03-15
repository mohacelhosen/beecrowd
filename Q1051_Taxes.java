import java.util.Scanner;

public class Q1051_Taxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        double tax = 0;

        if (income > 4500) {
            tax = (income - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        } else if (income > 3000) {
            tax = (income - 3000) * 0.18 + 1000 * 0.08;
        } else if (income > 2000) {
            tax = (income - 2000) * 0.08;
        }

        if (tax > 0) {
            System.out.printf("R$ %.2f\n", tax);
        } else {
            System.out.println("Isento");
        }

        sc.close();
    }
}
