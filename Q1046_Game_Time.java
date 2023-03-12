import java.util.Scanner;

public class Q1046_Game_Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int st = in.nextInt();
        int et = in.nextInt();
        int gt = 0;

        if(st>et){
            gt = (24-st)+et;
        }else if(st==et){
            gt=24;
        }else{
            gt=st-et;
        }
        gt = Math.abs(gt);
        System.out.printf("O JOGO DUROU %d HORA(S)\n",gt);
    }
}
