import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int nilai = in.nextInt();

        if (nilai >= 90 && nilai <=100){
            System.out.println("A");
        }else if (nilai >= 80 && nilai <=89) {
            System.out.println("B");
        }  else if (nilai >=70 && nilai <= 79) {
            System.out.println("C");
        }else if (nilai >= 60 && nilai <=69) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }
    
    }
    
}
