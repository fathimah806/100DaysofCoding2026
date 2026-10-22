import java.util.Scanner;
public class Day53 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("masukkan jumlah :");
        int j = in.nextInt();
        int i = 1;

        do {
            System.out.println("Perulangan ke-" + i);
            i++;
        } while (i <= j);

    }
}
