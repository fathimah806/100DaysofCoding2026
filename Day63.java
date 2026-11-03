import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("m\t:");
        int m = in.nextInt();
        System.out.print("n\t:");
        int n = in.nextInt();
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= m ;
        }

        System.out.println("hasil\t:" + hasil);

        in.close();
    }
}
