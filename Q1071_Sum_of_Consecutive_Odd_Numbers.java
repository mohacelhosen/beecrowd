

import java.util.Scanner;

public class Q1071_Sum_of_Consecutive_Odd_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int temp =0, oddSum =0;

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
