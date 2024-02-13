import java.util.Scanner;

public class BEE1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int even_count = 0;
        int odd_count = 0;
        int positive_count = 0;
        int negative_count = 0;

        for (int i = 0; i < 5; i++) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
            if (n > 0) {
                positive_count++;
            } else if (n < 0) {
                negative_count++;
            }
        }
        System.out.println(even_count + " valor(es) par(es)");
        System.out.println(odd_count + " valor(es) impar(es)");
        System.out.println(positive_count + " valor(es) positivo(s)");
        System.out.println(negative_count + " valor(es) negativo(s)");
        scanner.close();
    }
}
