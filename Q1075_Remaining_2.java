import java.util.Scanner;

public class Q1075_Remaining_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<10000; i++){
            if(i%n==2) System.out.println(i);
        }
    }
}
