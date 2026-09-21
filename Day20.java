public class Day20 {
    public static void main(String[] args) {
        // mengubh tipe data primitif ke String
        int angka = 100;
        double nilai = 90.5;
        char huruf = 'A';
        boolean benar = true;

        String S1 = String.valueOf(angka);
        String S2 = String.valueOf(nilai);
        String S3 = String.valueOf(huruf);
        String S4 = String.valueOf(benar);

        System.out.println("Integer\t:" + S1);
        System.out.println("Double\t:" + S2);
        System.out.println("Char\t:" + S3);
        System.out.println("Boolean\t:" + S4);
    }
    
}
