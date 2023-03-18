import java.util.Scanner;

public class Q2006_Identifying_Tea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int[] contestant = new int[5];
        int teaSample = in.nextInt();
        
        for(int i=0; i<5; i++){
            contestant[i]=in.nextInt();
        }
        
        for(int i=0; i<5; i++){
            if(contestant[i]==teaSample){
                count++;
            }
        }
        System.out.println(count);
    }
}
