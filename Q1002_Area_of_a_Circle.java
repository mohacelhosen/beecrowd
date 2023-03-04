import java.util.*;
class Q1002_Area_of_a_Circle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double R =in.nextDouble();
        double A = 3.14159 * (R*R);
        System.out.printf("A=%.4f\n",A);
    }
}