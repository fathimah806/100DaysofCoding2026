import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, hasil = 1;
        a = input.nextInt();

        for (int b = a; b >= 1; b--) {
            hasil *= b;
        }

        System.out.println(hasil);
    }
}
