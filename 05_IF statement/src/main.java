import java.util.Scanner;
public class main {
    public static void main(String[] args){

        // Data Member
        int total_belanja = 0;

        // Membuat scanner menerima input dari keyboard
        Scanner scan = new Scanner(System.in);
       
        // mengambil input dari keyboard 
        System.out.print("Masukkan Total Belanja : ");
        total_belanja = scan.nextInt();
    
        // cek total belanja
        if (total_belanja >= 50000) {
            System.out.println("Anda Mendapatkan Mouse : ");
        }else{
            System.out.println("belanja anda kurang dari Rp. 5000"); 
        }
    }
}
