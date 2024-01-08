import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        try (Scanner input = new Scanner(System.in)) {
            // Meminta pengguna memasukkan batas akhir
            System.out.print("Masukkan batas akhir: ");
            int batasAkhir = input.nextInt();

            // Meminta pengguna memasukkan angka perkalian
            System.out.print("Masukkan angka perkalian: ");
            int angkaPerkalian = input.nextInt();

            // Melakukan perkalian dari 1 hingga batas akhir dengan angka perkalian tertentu
            for (int i = 1; i <= batasAkhir; i++) {
                int hasilPerkalian = i * angkaPerkalian;
                System.out.println(i + " x " + angkaPerkalian + " = " + hasilPerkalian);
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}