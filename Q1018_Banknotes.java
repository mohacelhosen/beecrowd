import java.io.IOException;
import java.util.Scanner;
public class Q1018_Banknotes {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nota100=n/100;
        int nota50=(n%100)/50;
        int nota20=((n%100)%50)/20;
        int nota10=(((n%100)%50)%20)/10;
        int nota5=((((n%100)%50)%20)%10)/5;
        int nota2=(((((n%100)%50)%20)%10)%5)/2;
        int nota1=((((((n%100)%50)%20)%10)%5)%2)/1;

        System.out.printf("%d\n",n);
        System.out.printf("%d nota(s) de R$ 100,00\n",nota100);
        System.out.printf("%d nota(s) de R$ 50,00\n",nota50);
        System.out.printf("%d nota(s) de R$ 20,00\n",nota20);
        System.out.printf("%d nota(s) de R$ 10,00\n",nota10);
        System.out.printf("%d nota(s) de R$ 5,00\n",nota5);
        System.out.printf("%d nota(s) de R$ 2,00\n",nota2);
        System.out.printf("%d nota(s) de R$ 1,00\n",nota1);
    }
}
