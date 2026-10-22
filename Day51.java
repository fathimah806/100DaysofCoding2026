import java.util.Scanner;
public class Day51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("masukkan jumlah :");
        int j = in.nextInt();
        for (int i = 1 ; i <= j; i++) {
            System.out.println("Perulangan ke-" + i);
        }

    }
}
