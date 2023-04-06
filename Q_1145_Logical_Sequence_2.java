import java.util.Scanner;

public class Q_1145_Logical_Sequence_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x =in.nextInt();
        int y =in.nextInt();
        for(int i=1; i<=y; i++){
            
            for(int j=1; j<x; j++){
                System.out.print(i+" ");
                i++;
            }
            System.out.println(i);
            
        }
        
        in.close();
    }
}
