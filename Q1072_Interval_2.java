import java.util.Scanner;

public class Q1072_Interval_2 {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    int inside = 0;
    int outside = 0;
    for(int i=0; i<test; i++){
        int temp = in.nextInt();
        if(temp>=10 && temp<=20){
            inside++;
        }else{
            outside++;
        }
    }
    System.out.printf("%d in\n%d out\n",inside,outside);
 }   
}
