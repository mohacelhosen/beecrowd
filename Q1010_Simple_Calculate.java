import java.util.Scanner;
public class Q1010_Simple_Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product1Code=in.nextInt();
        int product1Units = in.nextInt();
        double product1Price = in.nextDouble();
        
        int product2Code=in.nextInt();
        int product2Units = in.nextInt();
        double product2Price = in.nextDouble();

        double paid1= (product1Units * product1Price);
        double paid2= (product2Units * product2Price);

        double total = (paid1+paid2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}
