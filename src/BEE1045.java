import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BEE1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        List<Double> sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);

        Collections.sort(sides, Collections.reverseOrder());

        a = sides.get(0);
        b = sides.get(1);
        c = sides.get(2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        scanner.close();
    }
}
