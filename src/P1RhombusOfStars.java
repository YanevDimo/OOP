import java.util.Scanner;

public class P1RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int r = 1; r < n; r++) {
            for (int j = 0; j < n - r; j++) {
                System.out.println(" ");
            }
            for (int i = 0; i < r; i++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("* ");
        }
        System.out.println();
        for (int r = 1; r < n; r++) {
            for (int j = 0; j < r; j++) {
                System.out.println(" ");
            }
            for (int i = 0; n < r; i++) {
                System.out.println("* ");
            }
        }
    }
}
