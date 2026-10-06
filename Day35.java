import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int nilai = in.nextInt();
        int kehadiran = in.nextInt();

        if (nilai >= 75) {
            if (kehadiran >= 80 ) {
                System.out.println("lulus dengan predikat baik");
            }else{
                System.out.println("lulus, tetapi kehadiran saya kurang");
            }
        }else{
            System.out.println("tdk lulus");
        }
    }
    
}
