import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int p ;

        do {
            System.out.println("""
                =========== MENU ==========
                1. Nasi  Goreng
                2. Mie ayam
                3. Bakso
                4. Keluar
                """);

                System.out.print("pilih menu :");
                p = in.nextInt();
                switch (p){
                    case 1 :
                    System.out.println("Anda memilih Nasi Goreng");
                    break;

                     case 2 :
                    System.out.println("Anda memilih Mie Ayam");
                    break;

                     case 3 :
                    System.out.println("Anda memilih Bakso");
                    break;

                     case 4 :
                    System.out.println("Terima Kasih");
                    break;
                    default:
                    System.out.print("pilihan tidak tersedia");
                }
            
        }while (p != 4);
        
    }
    
}
