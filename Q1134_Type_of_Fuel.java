import java.util.Scanner;

public class Q1134_Type_of_Fuel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        int alcool = 0;
        int gasoline = 0;
        int diesel = 0;
        System.out.println("MUITO OBRIGADO");
        while(type!=4){
            if(type==1){ 
                alcool++; 
                type=in.nextInt();}
            else if(type==2){
                gasoline++;  
                type=in.nextInt();}
            else if(type==3){
                diesel++;
                type=in.nextInt();
                }
            else{type=in.nextInt();}
        }
        System.out.printf("Alcool: %d\n",alcool);
        System.out.printf("Gasoline : %d\n",gasoline); 
        System.out.printf("Diesel : %d\n", diesel);
    }
}
