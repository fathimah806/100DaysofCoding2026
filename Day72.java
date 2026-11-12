import java.util.Scanner;
public class Day72{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a;
        int t = 0;

        for(;;){
            a = in.nextInt();
            if (a < 0){
                break;
            }
            t += a;
        }
        System.out.println("total : " + t);
    }
    
}
