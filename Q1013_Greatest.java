import java.util.Scanner;

public class Q1013_Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int greatest = (A>B)?((A>C)?(A):(C)):((B>C)?(B):(C));
        System.out.printf("%d eh o maior\n",greatest);
    }
}
