public class Day76 {
    public static void main(String[] args) {

        String n = "  Fatima Sahra  ";
        String b = n.trim();
        String c = b.substring(0, 6);
        String d= b.replace("Sahra", "Gopi");

        System.out.println("Nama asli       : " + n );
        System.out.println("Setelah trim    : " + b);
        System.out.println("Substring       : " + c);
        System.out.println("Setelah replace : " + d);
    }
}
