import java.util.Scanner;

public class Day55 {

    static int cekAngka(int angka) {
        if (angka < 0) {
            return -1;
        }
        return angka;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

            int hasil = cekAngka(angka);

            if (hasil == -1) {
                System.out.println("Angka negatif dilewati!");
                continue;
            }

            if (angka == 0) {
                System.out.println("Perulangan dihentikan!");
                break;
            }

            total += hasil;
        }

        System.out.println("Total angka positif: " + total);
        input.close();
    }
}
