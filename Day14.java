import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);


        System.out.print("nilai pertama :");
        int a = in.nextInt();

        System.out.print("nilai kedua   :");
        int b = in.nextInt();

        int penjumlahan = a + b;
        int pengurangan = a - b;

        System.out.println("Hasil penjumlahan : " + penjumlahan);
        System.out.println("Hasil pengurangan : " + pengurangan);
        
    }
}
