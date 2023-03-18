

import java.util.Scanner;

public class Q1099_Sum_of_Consecutive_Odd_Numbers_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        

        for(int t=0; t<test; t++){
            int x = 0;
            int y = 0;
            int oddSum = 0;
             x = in.nextInt();
             y = in.nextInt();
            int temp =0;
    
            if(x<y){
                temp=x;
                x=y;
                y=temp;
            }
            if(y%2==0){
                y=y+1;
                for(int i=y; i<x; i+=2){
                    oddSum =oddSum+i;
                }
            }else{
                y=y+2;
                for(int i=y; i<x; i+=2){
                    oddSum =oddSum+i;
                } 
            }
            System.out.println(oddSum);
        }
        
    }
}
