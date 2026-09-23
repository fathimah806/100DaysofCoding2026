import java.util.Scanner;
public class Day22 {
    public static void main(String[] args) {
// program untuk menukar nilai dua variabel
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = in.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = in.nextInt();

        int sementara = a; //nilai a disimpan terlebih dahulu ke variabelel sementara
        a = b; // nilai b dimasukkan ke dalam vareabel a
        b = sementara; //nilai yg disimpan di vareabel sementara di masukkan ke nilai b

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
