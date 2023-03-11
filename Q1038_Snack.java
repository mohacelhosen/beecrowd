import java.util.Scanner;
public class Q1038_Snack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int code = in.nextInt();
        int items = in.nextInt();
        double total = 0;

        switch(code){
            case 1: total= 4*items;
                    break;
            case 2: total= 4.50*items;
                    break;
            case 3: total= 5*items;
                    break;
            case 4: total= 2*items;
                    break;
            case 5: total= 1.50*items;
            break;
        }
        System.out.printf("Total: R$ %.2f\n",total);
    }
}
