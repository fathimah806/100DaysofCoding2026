import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] a = new int[3];

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        int m = a[0];

        for (int i = 0; i < a.length; i++) {
            if (m < a[i]) {
                m = a[i];
            }
        }

        System.out.println(m);
    }
}
