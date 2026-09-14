import java.util.Scanner;

public class evaluasi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nama = in.nextLine();
        String Nim = in.nextLine();
        String ps= in.nextLine();
        String fakultas = in.nextLine();
        String pg = in.nextLine();

        System.out.println("=========== PROFIL AKADEMIK===========");
        System.out.println("nama             : " + nama);
        System.out.println("nim              : " + Nim);
        System.out.println("profram study    : " + ps);
        System.out.println("fakultas         : " + fakultas);
        System.out.println("perguruan tinggi : " + pg);
        System.out.println("================================");

    }
}
