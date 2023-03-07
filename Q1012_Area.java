import java.util.Scanner;

public class Q1012_Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A= in.nextDouble();
        double B= in.nextDouble();
        double C= in.nextDouble();
        final double pi = 3.14159;

        double triangleArea =  (1.0/2.0)*A * C;
        double circleArea =  pi*(C*C);
        double trapeziumArea =  (A+B)/2*C;
        double squareArea =  B*B;
        double rectangleArea =  A*B;

        System.out.printf("TRIANGULO: %.3f\n", triangleArea);
        System.out.printf("CIRCULO: %.3f\n", circleArea);
        System.out.printf("TRAPEZIO: %.3f\n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f\n", squareArea);
        System.out.printf("RETANGULO: %.3f\n", rectangleArea);
    }
}
