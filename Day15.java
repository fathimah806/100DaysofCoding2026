import java.util.Scanner;
public class Day15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// oprasi aritmatika perkalian dan pembagian
        double a = in.nextInt();
        double b = in.nextInt();
        double perkalian = a * b;
        double pembagian = a / b;
        System.out.printf("hasil perkalian : %.2f%nhasil pembagian : %.2f ",perkalian, pembagian);
        
    }
}
