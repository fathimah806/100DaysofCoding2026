import java.util.Scanner;

public class Day11 {
    public static void main (String[] args) {

        //Membuat Scanner 
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        System.out.println("Masukkan umur : ");
        int umur = input.nextInt();
        input.nextLine(); // membersihkan enter

          System.out.print("Masukkan alamat : ");
        String alamat = input.nextLine();

        System.out.print("Masukkan prodi  : ");
        String prodi = input.nextLine();

        // Menampilkan biodata
        System.out.println("\n===== BIODATA =====");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);
        System.out.println("Prodi  : " + prodi);

        // Menutup Scanner
        input.close();

    }
}
