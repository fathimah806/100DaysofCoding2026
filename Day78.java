import java.util.Scanner;

public class DayString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      
        System.out.println("=== BUAT AKUN ===");

        System.out.print("Buat Username : ");
        String user = input.nextLine();

        System.out.print("Buat Password : ");
        String pass = input.nextLine();

        System.out.println("Akun berhasil dibuat!");
      
        System.out.println("=== LOGIN ===");

        String username, password;

        while (true) {

            System.out.print("Username : ");
            username = input.nextLine();

            System.out.print("Password : ");
            password = input.nextLine();

            if (username.equals(user) &&
                password.equals(pass)) {

                System.out.println("Login Berhasil!");
                break;

            } else {
                System.out.println("Username atau Password salah!");
                System.out.println("Silakan coba lagi.\n");
            }
        }
    }
}
