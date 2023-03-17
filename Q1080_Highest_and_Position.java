import java.util.Arrays;
import java.util.Scanner;

public class Q1080_Highest_and_Position {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i=0; i<5; i++){
            numbers[i]=in.nextInt();
        }
        
        int[] temp = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(temp);
        int large = temp[temp.length-1];

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==large){
                System.out.printf("%d\n%d\n",large,i+1);
            }
        }
        
    }
}
