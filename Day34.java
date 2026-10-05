 import java.util.Scanner;
 public class Day34 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        // percabangan if - else is - else

        int umur = in.nextInt();
        if (umur < 17  ) {
                System.out.println("belum mempunyai ktp dan sim");
        }else if(umur  <= 18){
            System.out.println("mempunyai ktp dan blm mempunyai sim");
        }else{
            System.out.println("mempunyai ktp dan sim");
        }

    }
    
}
