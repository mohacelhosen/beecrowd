import java.util.Scanner;

public class Q1113_Ascending_and_Descending{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        while(x!=y){
            if(x>y)System.out.println("Decrescente");
            else System.out.println("Crescente");
             x = in.nextInt();
             y = in.nextInt();
        }
    }
}