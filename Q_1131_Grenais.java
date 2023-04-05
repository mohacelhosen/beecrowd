import java.util.Scanner;
public class Q_1131_Grenais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int interGoals, gremioGoals, interWins = 0, gremioWins = 0, draws = 0, totalMatches = 0;

        while (true) {
            interGoals = input.nextInt();
            gremioGoals = input.nextInt();
            totalMatches++;

            if (interGoals > gremioGoals) {
                interWins++;
            } else if (gremioGoals > interGoals) {
                gremioWins++;
            } else {
                draws++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            int choice = input.nextInt();

            if (choice == 2) {
                break;
            }
        }

        System.out.printf("%d grenais\n", totalMatches);
        System.out.printf("Inter:%d\n", interWins);
        System.out.printf("Gremio:%d\n", gremioWins);
        System.out.printf("Empates:%d\n", draws);

        if (interWins > gremioWins) {
            System.out.println("Inter venceu mais");
        } else if (gremioWins > interWins) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        input.close();
    }
}
