
import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = in.nextLine();

        System.out.print("Masukkan kata yang ingin dicari: ");
        String cari = in.nextLine();

        System.out.print("Masukkan kata pengganti: ");
        String ganti = in.nextLine();

        System.out.println();

        System.out.println("Nama          : " + nama);
        System.out.println("Panjang nama  : " + nama.length());
        System.out.println("Huruf besar   : " + nama.toUpperCase());
        System.out.println("Huruf kecil   : " + nama.toLowerCase());

        System.out.println("Nama sama?        : " + nama.equals("Fatima"));
        System.out.println("tdk melihat huruf : " + nama.equalsIgnoreCase("fatima"));
        System.out.println("Mengandung kata?  : " + nama.contains(cari));
        System.out.println("Apakah kosong?    : " + nama.isEmpty());

    
        System.out.println("Substring        : " + nama.substring(0, 6));
        System.out.println("Replace          : " + nama.replace(cari, ganti));
        System.out.println("Trim             : " + nama.trim());

        
    }
}
