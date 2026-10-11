import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("masukkan berat emas:");
        double angka = in.nextDouble();
    
        if (angka %2==0 ){
             System.out.println("bilangan bulat(emas fisik)");
        }else if (angka%2!=0){
            System.out.println("bilangan desimal (emas digital)");
        }

    }
}
