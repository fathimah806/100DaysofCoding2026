import java.util.Scanner;
public class Day25 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        final double pi = 3.14;
        double r = in.nextDouble();
        double r2 = in.nextDouble();
        double lingkaran = pi * r * r2 ;

        System.out.println("luas lingkaran : "+ lingkaran);
    }

    
}
