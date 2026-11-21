
import java.util.Scanner;

public class Day81{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr= new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("angka ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println();
        
        System.out.println("Isi Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Indeks " + i + " = " + arr[i]);
        }
    }
}
