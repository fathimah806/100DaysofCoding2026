public class Day82 {
    public static void main(String[] args) {

        int[] nilai = {80, 85, 90, 75, 95};

        System.out.println("Elemen array dari akhir:");

        for (int i = nilai.length - 1; i >= 0; i--) {
            System.out.println(nilai[i]);
        }
    }
}
