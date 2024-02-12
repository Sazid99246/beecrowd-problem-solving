import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BEE1050 {
    public static void main(String[] args) {
        Map<Integer, String> DDD = new HashMap<>() {
            {
                put(61, "Brasilia");
                put(71, "Salvador");
                put(11, "Sao Paulo");
                put(21, "Rio de Janeiro");
                put(32, "Juiz de Fora");
                put(19, "Campinas");
                put(27, "Vitoria");
                put(31, "Belo Horizonte");
            }
        };

        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        boolean found = false;
        for (int dddKey : DDD.keySet()) {
            if (code == dddKey) {
                System.out.println(DDD.get(code));
                found = true;
                break; // No need to continue looping once found
            }
        }
        if (!found) {
            System.out.println("DDD nao cadastrado");
        }
        scanner.close();
    }
}
