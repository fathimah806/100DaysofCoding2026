public class Day19 {
    public static void main(String[] args) {

        // double ke float
        double angka1 = 10.5;
        float hasil1 = (float) angka1;

        // float ke long
        float angka2 = 20.5f;
        long hasil2 = (long) angka2;

        // long ke int
        long angka3 = 1000;
        int hasil3 = (int) angka3;

        // int ke short
        int angka4 = 200;
        short hasil4 = (short) angka4;

        // short ke byte
        short angka5 = 100;
        byte hasil5 = (byte) angka5;

        System.out.println("double ke float : " + hasil1);
        System.out.println("float ke long   : " + hasil2);
        System.out.println("long ke int     : " + hasil3);
        System.out.println("int ke short    : " + hasil4);
        System.out.println("short ke byte   : " + hasil5);
    }
}
