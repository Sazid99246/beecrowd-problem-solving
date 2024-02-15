import java.util.Scanner;

public class BEE1146 {

    public static void main(String[] args) {

        int X;
        Scanner input = new Scanner(System.in);

        while ((X = input.nextInt()) != 0) {
            String s = "";
            for (int i = 1; i <= X; i++) {
                if (i == X) {
                    s += i;                 
                }
                if (i == X) {
                } else {
                    s += i + " ";
                }
            }
            System.out.println(s);
        }
        input.close();
    }
}