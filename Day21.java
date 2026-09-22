public class Day21 {
    public static void main(String[] args) {
        
        String teksAngka = "100";
        String teksDesimal = "90.5";
        String teksBenar = "true";

        int angka = Integer.parseInt(teksAngka);
        double nilai = Double.parseDouble(teksDesimal);
        Boolean benar = Boolean.parseBoolean(teksBenar);

        System.out.println("Integer\t:" + angka);
        System.out.println("Double\t:" + nilai);
        System.out.println("Boolean\t:" +  benar);
    }

    
}
