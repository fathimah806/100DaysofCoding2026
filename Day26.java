import java.util.Scanner;
public class Day26 {
    public static void main(String[] args) {
        
        // soal ke 3 evaluasi

        Scanner in = new Scanner (System.in);

       int a = in.nextInt();
       int b =in.nextInt();
       a = a + b;
       b = a - b;
       a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    
}
