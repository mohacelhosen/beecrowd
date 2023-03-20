import java.util.Scanner;

public class Q1115_Quadrant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        while(x!=0 && y!=0){
            if(x>0 && y>0)System.out.println("primeiro");
            else if(x>0 && y<0)System.out.println("quarto");
            else if(x<0 && y<0)System.out.println("terceiro");
            else if(x<0 && y>0)System.out.println("segundo");
             x = in.nextInt();
             y = in.nextInt();
        }
        in.close();
    }
}
