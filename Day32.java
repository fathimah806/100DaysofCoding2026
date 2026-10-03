import java.util.Scanner;
public class Day32{
    public static void main(String[] args) {

       // latihan kombinasi operator
       
        Scanner in = new Scanner(System.in);

        System.out.print("Harga: ");
        double harga = in.nextDouble();

        System.out.print("Jumlah: ");
        int jumlah = in.nextInt();

        System.out.print("Uang: ");
        double uang = in.nextDouble();

        double total = harga * jumlah;

        total -= total * 0.10;
        total += total * 0.10;

        double kembalian = uang - total;

        jumlah++;

        System.out.println("\nTotal\t\t: " + total);
        System.out.println("Kembalian\t: " + kembalian);
        System.out.println("Jumlah + 1\t: " + jumlah);
        System.out.println("Genap\t\t: " + ((jumlah - 1) % 2 == 0));
    }
    }
