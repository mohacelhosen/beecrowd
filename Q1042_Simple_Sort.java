
import java.util.Scanner;
public class Q1042_Simple_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];

        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();

        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        
       for(int i=0; i<2; i++){
            for(int j=i+1; j<3;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
       }
       for(int i:arr){
        System.out.println(i);
       }
       System.out.println();
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);

    }
}
