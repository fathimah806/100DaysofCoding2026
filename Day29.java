import java.util.Scanner ;
public class Day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        // operator perbandingan lebih kecil dari(<),dan lebih besar dari(>)
        
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("a < b :" + (a < b));
        System.out.println("a > b :" + (a > b));
    }
    
}
