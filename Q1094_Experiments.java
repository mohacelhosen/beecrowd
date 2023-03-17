import java.util.Scanner;

public class Q1094_Experiments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int rabbit = 0;
        int rat = 0;
        int frog = 0;
        int totalAnimal = 0;
        for (int i = 0; i < test; i++) {
            int amount = in.nextInt();
            char animal = in.next().charAt(0);
            if (animal == 'C') {
                totalAnimal += amount;
                rabbit += amount;
            } else if (animal == 'R') {
                totalAnimal += amount;
                rat += amount;
            } else {
                totalAnimal += amount;
                frog += amount;
            }
        }

        System.out.printf("Total: %d cobaias\n", totalAnimal);
        System.out.printf("Total de coelhos: %d\n", rabbit);
        System.out.printf("Total de ratos: %d\n", rat);
        System.out.printf("Total de sapos: %d\n", frog);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (rabbit*100.00 / totalAnimal));
        System.out.printf("Percentual de ratos: %.2f %%\n", (rat*100.00 / totalAnimal));
        System.out.printf("Percentual de sapos: %.2f %%\n", (frog*100.00 / totalAnimal));
    }
}
