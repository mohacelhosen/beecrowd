import java.util.Scanner;
public class Q1118{
    public static void main (String[] args) {

        Scanner obj = new Scanner(System.in);

        int limit = 1;
        while(limit != 2){
            if(limit == 1){
                int counter = 0;
                float sum = 0;
                while(counter != 2){
                    float num = obj.nextFloat();
                    if(num >= 0.0 && num <= 10.0){
                        counter++;
                        sum += num;
                    }else{
                        System.out.println("nota invalida");
                    }
                }
                System.out.format("media = %.2f\n", (sum/counter));
            }
            System.out.println("novo calculo (1-sim 2-nao)");
            limit = obj.nextInt();
        }

    }
}