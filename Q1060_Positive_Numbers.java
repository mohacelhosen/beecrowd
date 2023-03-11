import java.util.Scanner;
public class Q1060_Positive_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] numbers = new double[6];  
        int count =0; 
        for(int i=0; i<6; i++){
            numbers[i]=in.nextDouble();
        }

        for(double x : numbers){
            if(x>0){
                count++;
            }
        }
        System.out.printf("%d valores positivos\n",count);
    }
}
