import java.util.Scanner;

public class Q1117_Score_Validation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float sum=0;
        float count = 0;

        while(count!=3){
            
            if(x>=0 && x<=10){
                count++;
                sum+=x;
            }else System.out.println("nota invalida");
            
            if(count==2)break;
            x = in.nextFloat();
        }
        System.out.printf("media = %.2f\n",(sum/2.0));
    }
}
