import java.util.Scanner;

public class Q1043_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();

        if(a+b>c && a+c>b && c+b>a){
            System.out.printf("Perimetro = %.1f\n",(a+b+c));
        }
        else{
            System.out.printf("Area = %.1f\n",(0.5*(a+b)*c));
        }
    }
}
