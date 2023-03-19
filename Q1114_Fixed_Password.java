import java.util.Scanner;

public class Q1114_Fixed_Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pwd =in.nextInt();
        while(pwd!=2002){
            System.out.println("Senha Invalida");
            pwd =in.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
