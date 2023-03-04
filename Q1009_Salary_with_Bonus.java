import java.util.Scanner;
public class Q1009_Salary_with_Bonus{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        double fixedSalary = in.nextDouble();
        double productSold = in.nextDouble();

         double commison = (productSold * 0.15);
         double totalSalary = fixedSalary+commison;

         System.out.printf("TOTAL = R$ %.2f\n",totalSalary);
    }
}
