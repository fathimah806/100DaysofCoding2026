import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // operator AND, OR, NOT
       
        int umur = input.nextInt();       
        boolean punyaKTP = input.nextBoolean();

        // AND (&&)
        System.out.println("AND : " + (umur >= 17 && punyaKTP));

        // OR (||)
        System.out.println("OR  : " + (umur >= 17 || punyaKTP));

        // NOT (!)
        System.out.println("NOT : " + (!punyaKTP));

        input.close();
    }
}
