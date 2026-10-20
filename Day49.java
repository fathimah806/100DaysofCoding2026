
import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();

        String hasil = (angka > 0) ? "Positif" :
                       (angka < 0) ? "Negatif" : "Nol";

        System.out.println("Bilangan tersebut: " + hasil);

        input.close();
    }
}
