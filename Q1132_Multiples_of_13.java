import java.util.Scanner;

public class Q1132_Multiples_of_13{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int sum = 0;
        
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        
        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
    
}