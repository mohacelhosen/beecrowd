import java.util.Scanner;

public class Q1045_Triangle_Types {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        double[] arr = new double[3];
        for(int i=0; i<3; i++){
            arr[i]=in.nextDouble();
        }
        for(int i=0; i<2; i++){
            for(int j=i+1; j<3; j++){
                if(arr[i] < arr[j]){
                    double temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        double a = arr[0];
        double b = arr[1];
        double c = arr[2];

        if(a>=b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if((a*a)==((b*b)+(c*c))){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if((a*a)>((b*b)+(c*c))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if((a*a)<(b*b)+(c*c)){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if(a==b && b==c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if((a==b || b==c || c==a) && (c!=a ||  a!=b || b!=a)){
            System.out.println("TRIANGULO ISOSCELES");
        } 
    }
}
