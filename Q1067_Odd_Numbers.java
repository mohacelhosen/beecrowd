import java.util.Scanner;

public class Q1067_Odd_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        for(int i=1; i<=x; i=i+2){
            System.out.println(i);
        }
    }
}
