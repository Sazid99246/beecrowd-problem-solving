public class BEE1155 {
    public static void main(String[] args) {
        double sum = 1.0;

        for (int i = 2; i <= 100; i++) {
            sum += 1.0 / i;
        }

        System.out.printf("%.2f%n", sum);
    }
}
