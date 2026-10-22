import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("masukkan jumlah :");
        int j = in.nextInt();
        int i = 1;

        while (i <= j) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }

    }
}
