import java.util.Scanner;

public class Q1133_Rest_of_a_Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if(x>y){
            int temp = x;
            x=y;
            y=temp;
        }

        for(int i=x+1; i<y; i++){
            if(i%5==2 || i%5==3){
                System.out.println(i);
            }
        }
    }
}
