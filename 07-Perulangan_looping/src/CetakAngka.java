import java.util.Scanner;
public class CetakAngka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = scan.nextInt();
        for (int i = 0; i < angka; i++) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}