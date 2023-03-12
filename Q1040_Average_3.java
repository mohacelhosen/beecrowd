import java.io.IOException;
import java.util.Scanner;
 
 class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d = in.nextFloat();
        

        float avg = (a*2+b*3+c*4+d*1)/(2+3+4+1);
        

        System.out.printf("Media: %.1f\n",avg);
        if(avg>=7.0){
            System.out.println("Aluno aprovado.");
        }else if(avg<5.0){
            System.out.println("Aluno reprovado.");
        }else if(avg>=5.0 && avg<=6.9){
            System.out.println("Aluno em exame.");
            
            float e = in.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",e);
            float reavg = (avg+e)/2;

            if(reavg>=5.0){
            
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",reavg);
            }else if(reavg<=4.9){
            
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n",reavg);
            }

        }

 
    }
 
}