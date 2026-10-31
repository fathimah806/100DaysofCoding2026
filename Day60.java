import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");

        int n = input.nextInt();
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil += i;
            System.out.print(i +" ");
        }

        System.out.println(" = " + hasil);

        input.close();
    }
}
