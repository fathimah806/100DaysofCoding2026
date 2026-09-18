import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("masukkan angka :");
        int angka = in.nextInt();

        angka += 5;
        angka -= 3;
        angka *= 1;
        angka /= 2;
        angka %= 5;
        System.out.println("hasil : " + angka);
 
        // operator penugasan
    }

}
