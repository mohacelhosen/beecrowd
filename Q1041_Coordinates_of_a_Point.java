import java.util.Scanner;

public class Q1041_Coordinates_of_a_Point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();

        if(x>0 && y>0){
            System.out.println("Q1");
        }else if(x==0 && y==0){
            System.out.println("Origem");
        }else if(x<0 && y>0){
            System.out.println("Q2");
        }else if(x<0 && y<0){
            System.out.println("Q3");
        }else if(x>0 && y<0){
            System.out.println("Q4");
        }else if(x==0 && (y<0 || y>0)){
            System.out.println("Eixo Y");
        }else if(y==0 && (x<0 || x>0)){
            System.out.println("Eixo X");
        }
    }
}
