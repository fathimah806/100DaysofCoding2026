import java.util.Scanner;
public class  Day37{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("masukkan bilangan\t:");
    int bilangan = in.nextInt();

    if(bilangan > 0){
        System.out.println("bilanagn positif");
    } else if(bilangan < 0){
        System.out.println("bilangan negatif");
    }else{
        System.out.println("bilangan nol");
    }
}
}
