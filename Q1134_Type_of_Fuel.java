import java.util.Scanner;

public class Q1134_Type_of_Fuel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int alcool = 0;
        int gasoline = 0;
        int diesel = 0;
        while(true){
            int num = in.nextInt();
            if (num == 4){
                break;
            }
            else if (num == 1){
                alcool += 1;
            }
            else if (num == 2){
                gasoline += 1;
            }
            else if (num == 3){
                diesel += 1;
            }
            else{
                continue;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasoline);
        System.out.printf("Diesel: %d\n", diesel);

        in.close();
    }
}
