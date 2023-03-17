import java.util.Scanner;

public class Q1078_Multiplication_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",i,n,(i*n));
        }
    }
}
