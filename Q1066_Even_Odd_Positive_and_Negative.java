import java.util.Scanner;

public class Q1066_Even_Odd_Positive_and_Negative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;
        for(int i=0; i<5; i++){
            numbers[i]=in.nextInt();
        }

        for (int i : numbers) {
            if(i%2==0){
                even++;
            }
            if(i%2!=0){
                odd++;
            }
            if(i>0){
                positive++;
            }
            if(i<0){
                negative++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",even,odd,positive,negative);

    }
}
