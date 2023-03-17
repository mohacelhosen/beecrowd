import java.io.IOException;

public class Q1097_Sequence_IJ_3 {
 public static void main(String[] args) throws IOException {
   
    for(int i=1, temp=7; i<=9; i+=2){
        
        for(int j=temp; j>=(temp-2); j--){
            System.out.printf("I=%d J=%d\n",i,j);
        }
        temp+=2;
    }
 }   
}
