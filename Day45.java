
import java.util.Scanner;

public class 45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== JENIS KENDARAAN ===");
        System.out.println("1. Sepeda Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Bus");
        System.out.println("4. Truk");

        System.out.print("Pilih kendaraan: ");
        int pilih = in.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Kendaraan: Sepeda Motor");
                break;
            case 2:
                System.out.println("Kendaraan: Mobil");
                break;
            case 3:
                System.out.println("Kendaraan: Bus");
                break;
            case 4:
                System.out.println("Kendaraan: Truk");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }

        input.close();
    }
}
