import java.util.Scanner;

public class Q1011_Sphere {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner in = new Scanner(System.in);
        double radius= in.nextDouble();
        double volume = (4.0/3)*pi*(radius*radius*radius);
        System.out.printf("VOLUME = %.3f\n",volume);
    }
}
