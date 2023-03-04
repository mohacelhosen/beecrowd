import java.util.Scanner;
public class Q1007_Difference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        int AB= A*B;
        int CD= C*D;
        int DIFERENCA  =(AB - CD);
        System.out.printf("DIFERENCA = %d\n",DIFERENCA );
    }
}
