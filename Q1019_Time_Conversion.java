import java.util.Scanner;
class Q1019_Time_Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int remainSeconds = ((seconds%3600)%60); 

        System.out.printf("%d:%d:%d\n",hours,minutes,remainSeconds);
    }
}
