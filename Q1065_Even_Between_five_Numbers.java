import java.util.Scanner;

public class Q1065_Even_Between_five_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] numbers = new double[5];
        int even =0;

        for(int i=0; i<5; i++){
            numbers[i]=in.nextDouble();
        }

        for (double d : numbers) {
            if(d%2==0){
                even++;
            }
        }
        System.out.printf("%d valores pares\n",even);
    }
}
