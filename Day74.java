import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String n = in.nextLine();

        System.out.println("Nama asli\t: " + n);
        System.out.println("Huruf besar\t: " + n.toUpperCase());
        System.out.println("Huruf kecil\t: " + n.toLowerCase());
        System.out.println("Jumlah karakter : " + n.length());

        in.close();
    }
}
