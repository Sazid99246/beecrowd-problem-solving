import java.util.Scanner;

public class BEE1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int interWins = 0, gremioWins = 0, draws = 0, grenais = 0;
        
        do {
            int interGoals = scanner.nextInt();
            int gremioGoals = scanner.nextInt();
            grenais++;
            
            if (interGoals > gremioGoals) {
                interWins++;
            } else if (gremioGoals > interGoals) {
                gremioWins++;
            } else {
                draws++;
            }
            
            System.out.println("Novo grenal (1-sim 2-nao)");
        } while (scanner.nextInt() == 1);
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interWins);
        System.out.println("Gremio:" + gremioWins);
        System.out.println("Empates:" + draws);
        
        if (interWins > gremioWins) {
            System.out.println("Inter venceu mais");
        } else if (gremioWins > interWins) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        
        scanner.close();
    }
}
