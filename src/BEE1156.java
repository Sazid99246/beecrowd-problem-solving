public class BEE1156 {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 2;
        double sum = 1.0;

        while (n1 <= 39) {
            sum += (double) n1 / (double) n2;
            n1 += 2;
            n2 *= 2;
        }

        System.out.printf("%.2f%n", sum);
    }
}
