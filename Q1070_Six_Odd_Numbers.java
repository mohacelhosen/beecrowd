import java.util.Scanner;

public class Q1070_Six_Odd_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int count = 6;
        while(count!=0){
            if(x%2!=0){
                System.out.println(x);
                count--;
            }
            x++;
        }
    }
}
