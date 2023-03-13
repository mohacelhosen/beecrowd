import java.util.Scanner;

public class Q1048_Salary_Increase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float f= in.nextFloat();

        if(f>=0 && f<=400){
            System.out.printf("Novo salario: %.2f\n",((f*0.15)+f));
            System.out.printf("Reajuste ganho: %.2f\n",(f*0.15));
            System.out.println("Em percentual: 15%");
        }else if(f>400 && f<=800){
            System.out.printf("Novo salario: %.2f\n",((f*0.12)+f));
            System.out.printf("Reajuste ganho: %.2f\n",(f*0.12));
            System.out.println("Em percentual: 12%");
        }else if(f>800 && f<=1200){
            System.out.printf("Novo salario: %.2f\n",((f*0.1)+f));
            System.out.printf("Reajuste ganho: %.2f\n",(f*0.1));
            System.out.println("Em percentual: 10%");
        }else if(f>1200 && f<=2000){
            System.out.printf("Novo salario: %.2f\n",((f*0.07)+f));
            System.out.printf("Reajuste ganho: %.2f\n",(f*0.07));
            System.out.println("Em percentual: 7%");
        }else if(f>2000){
            System.out.printf("Novo salario: %.2f\n",((f*0.04)+f));
            System.out.printf("Reajuste ganho: %.2f\n",(f*0.04));
            System.out.println("Em percentual: 4%");
        }
    }
}
