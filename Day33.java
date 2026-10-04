import java.util.Scanner;

public class 33{
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 75) {
            System.out.println(nama + " dinyatakan LULUS");
        } else {
            System.out.println(nama + " dinyatakan TIDAK LULUS");
        }
    }
}
