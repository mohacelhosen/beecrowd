import java.util.Scanner;

public class Q_1143_Squared_and_Cubic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i+" "+(i*i)+" "+(i*i*i));
        }
    }
}
