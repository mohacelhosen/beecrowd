import java.util.Scanner;

public class Q1061_Event_Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dia1 =in.next();
        int startDay = in.nextInt();
        int startHour = in.nextInt();
        String sc1= in.next();
        int startMinute = in.nextInt();
        String sc2= in.next();
        int startSecond = in.nextInt();

        String dia2 =in.next();
        int endDay = in.nextInt();
        int endHour = in.nextInt();
        String ec1= in.next();
        int endMinute = in.nextInt();
        String ec2= in.next();
        int endSecond = in.nextInt();

        int startDuration = (startDay*24*60*60)+(startHour*60*60)+(startMinute*60)+startSecond;
        int endDuration = (endDay*24*60*60)+(endHour*60*60)+(endMinute*60)+endSecond;


        int totalDuration = (endDuration-startDuration);

        int day = totalDuration/86400;
        int hour = (totalDuration%86400)/3600;
        int minute = ((totalDuration%86400)%3600)/60;
        int second = ((totalDuration%86400)%3600)%60;

        System.out.printf("%d dia(s)\n",day);
        System.out.printf("%d hora(s)\n",hour);
        System.out.printf("%d minuto(s)\n",minute);
        System.out.printf("%d segundo(s)\n",second);
    }
}
