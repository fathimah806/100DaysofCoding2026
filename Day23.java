import java.util.Scanner;
public class Day23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("masukkan sisi persegi :");
        double sisi = in.nextDouble();
        double luas = sisi * sisi;
        System.out.println("luas persegi\t:" + luas);
    }
}
