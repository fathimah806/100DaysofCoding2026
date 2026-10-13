import java.util.Scanner;
public class Day42{
public static void main(String[] args) {
    Scanner in = new Scanner (System.in );

    System.out.print("masukkan gaji pokok\t:");
    double gp = in.nextDouble();
    System.out.print("masukkan tunjangan\t:");
    double t = in.nextDouble();
    double p = gp * 0.05;
    double gb = gp + t - p;

    System.out.println("Gaji Pokok\t:" +gp);
    System.out.println("tunjangan\t:" + t);
    System.out.println("pajak\t\t:"+ p);
    System.out.println("Gaji Bersih\t:"+ gb);
    


}
}
