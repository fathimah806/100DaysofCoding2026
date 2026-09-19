public class Day18 {
    public static void main(String[] args) {
        // conversi otomatis dari tipe kecil ke besar
        byte angkaByte = 10;

        short angkaShort = angkaByte;
        int angkaInt = angkaShort;
        long angkaLong = angkaInt;
        float angkaFloat = angkaLong;
        double angkadouble = angkaFloat;

        System.out.println("Byte\t:" +angkaByte);
        System.out.println("Short\t:" + angkaShort);
        System.out.println("int\t:" +angkaInt);
        System.out.println("long\t:" + angkaLong);
        System.out.println("float\t:"+ angkaFloat);
        System.out.println("Double\t:" + angkadouble);
    }
    
}
