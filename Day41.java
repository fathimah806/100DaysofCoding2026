import java.util.Scanner;
public class Day41{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan suhu\t:");
        double suhu = in. nextDouble();
        String Kondisi;
          
      
        if (suhu < 18 ) {
            Kondisi = "ruangan dingin";
           
        }else if (suhu >= 18 && suhu <= 25) {
             Kondisi = "ruangan sejuk";
            
        }else if (suhu >= 26 && suhu <= 30){
             Kondisi = "ruangan normal";
           
        }else {
             Kondisi = " ruangan panas";
            
        }

        System.out.println("suhu ruangan\t:" +suhu + "\u00B0C");
        System.out.println("Kondisi ruangan : " + Kondisi);
        
    }
}
