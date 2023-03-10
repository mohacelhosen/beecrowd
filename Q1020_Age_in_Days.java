import java.util.Scanner;
public class Q1020_Age_in_Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int year = days/365;
        int month = (days%365)/30;
        int day = (days%365)%30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",year,month,day);
    }
}
