import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("===== MENU MAKANAN =====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Selesai");
        System.out.print("Pilih menu (1-4): ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng");
            System.out.println("Harga: Rp15.000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Ayam");
            System.out.println("Harga: Rp12.000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Bakso");
            System.out.println("Harga: Rp10.000");
        } else if (pilihan == 4) {
            System.out.println("Terima kasih!");
        } else {
            System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}
