import java.util.Scanner;

public class Q1116_Dividing_X_by_Y {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        

        for(int i=0; i<test; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            if(y!=0){
                double result = (double)x/(double)y;
                System.out.printf("%.1f\n",result);
            }else System.out.println("divisao impossivel");
        }
    }
}
