public class perulanganfloating {
    public static void main(String[] args) {
        // batas awal dan akhir untuk perulangan 
        double start = 1.0;
        double end = 5.0;

        // increment atau langkah perulangan
        double step = 0.5;

        // perulangan menggunakan for loop
        for (double i = start; i <= end; i += step) {
            System.out.println("Nilai: " + i);
        }
    }
}