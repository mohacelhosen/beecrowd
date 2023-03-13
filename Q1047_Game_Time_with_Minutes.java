import java.util.Scanner;

public class Q1047_Game_Time_with_Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        int duration = 0;

        if (startHour == endHour && startMinute == endMinute) {
            duration = 24 * 60;
        } else {
            if (endHour < startHour || (endHour == startHour && endMinute < startMinute)) {
                endHour += 24;
            }

            int startInMinutes = startHour * 60 + startMinute;
            int endInMinutes = endHour * 60 + endMinute;
            duration = endInMinutes - startInMinutes;
        }

        int durationHours = duration / 60;
        int durationMinutes = duration % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHours, durationMinutes);

        sc.close();
    }
}
