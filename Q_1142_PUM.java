import java.util.Scanner;

public class Q_1142_PUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 1;
        int end =start+3;
        int n=in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=start; j<end; j++){
                System.out.print(j+" ");
            }
            System.out.println("PUM");
            start=end+1;
            end=start+3;
            
        }
    }
}
