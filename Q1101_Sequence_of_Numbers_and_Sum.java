import java.util.Scanner;

public class Q1101_Sequence_of_Numbers_and_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int sum =0;
        while( m>0 && n>0){
            if(n>m){ int temp = n; n=m; m=temp;}
            for(int i=n; i<=m; i++){
                sum+=i;
                System.out.print(i+" ");
            }
            System.out.println("Sum="+sum);
            sum=0;
            m=in.nextInt();
            n=in.nextInt();
        }
    }
}
