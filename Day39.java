import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double angka1, angka2, hasil;
        char operator;
        
        System.out.print("Masukkan angka pertama :");
        angka1 = in.nextDouble();

        System.out.print("masukkan operator :");
        operator = in.next().charAt(0);

        System.out.print("masukkan angka kedua :");
        angka2 = in.nextDouble();

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil = " + hasil);
        }else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil = " + hasil);
        }else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil = " + hasil);
        }else if (operator == '/') {
            if (angka2 != 0){
                hasil = angka1 / angka2;
                System.out.println("Hasil = " + hasil);
            }else{
                System.out.println("tdk bisa di bagi");
            }
        }else{
            System.out.println("operator tdk");
        }

    }
}
