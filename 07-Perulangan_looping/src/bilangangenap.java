import java.util.Scanner;
public class bilangangenap {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Masukkan berapa baris *: ");
        int angka = Scan.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        Scan.close();
    } 
}