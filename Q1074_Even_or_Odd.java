import java.util.Scanner;

public class Q1074_Even_or_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i=0; i<test; i++){
            int n = in.nextInt();
            if(n>0){
                
                if(n%2==0)System.out.print("EVEN ");
                else System.out.print("ODD ");
                System.out.println("POSITIVE");
            }else if(n<0){
                if(n%2==0)System.out.print("EVEN ");
                else System.out.print("ODD ");
                System.out.println("NEGATIVE");
            }else{
                System.out.println("NULL");
            }
        }
    }
}
