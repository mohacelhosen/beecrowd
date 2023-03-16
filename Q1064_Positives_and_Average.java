import java.util.Scanner;

public class Q1064_Positives_and_Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] numbers = new float[6];
        for(int i=0; i<6; i++){
            numbers[i]=in.nextFloat();
        }

        int totalPositive =0;
        float positveSum =0;
        for(float f:numbers){
            if(f>0) {
                totalPositive++;
                positveSum = positveSum +f;
            }
        }
        float avg = positveSum/totalPositive;
        System.out.printf("%d valores positivos\n",totalPositive);
        System.out.printf("%.1f\n",avg);
    }
}
