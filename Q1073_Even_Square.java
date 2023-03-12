import java.util.Scanner;

public class Q1073_Even_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n; i++ ){
            if(i%2==0){
                System.out.printf("%d^%d = %d\n",i,2,(i*i));
            }
        }
    }
}
