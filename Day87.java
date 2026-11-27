import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
int[] a = new int[3];

for (int i = 0; i < 3; i++) {  
        System.out.print("angka : ");  
        a[i] = input.nextInt();  
    }  

    a[1] = 20;  

    System.out.println("setelah diubah:");  

    for (int i = 0; i < 3; i++) {  
        System.out.println(a[i]);  
    }  
}

}
