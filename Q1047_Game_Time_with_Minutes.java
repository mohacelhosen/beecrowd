

import java.util.Scanner;

 class Q1047_Game_Time_with_Minutes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sth = in.nextInt();
        int stm = in.nextInt();
        int eth = in.nextInt();
        int etm = in.nextInt();
        int gth = 0;
        int gtm = 0;



        if(sth==eth ){
            gth=24;
            if(stm==etm){
                gtm=0;
            }else if(stm>etm){
                gtm=(60-stm)+etm;
            }else{
                gtm=etm-stm;
            }

        }else if(sth>eth){
            gth=(24-sth)+eth;
            if(stm>etm){
                gtm=(60-stm)+etm;
            }else if(stm==etm){
                gtm=0;
            }else{
                gtm=etm-stm;
            }
        }else{
            gth=eth-sth;
            int temp =++sth;
            if((temp)==eth) gth=0;
            if((temp)==eth && stm==etm){ gth=1; gtm=0;};
            if(stm>etm){

                gtm=(60-stm)+etm;
            }else{
                gtm=etm-stm;
            }

        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",gth,gtm);
    }
}
