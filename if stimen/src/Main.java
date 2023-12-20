import java.util.Scanner ;
public class Main {
public static void main(String[] args) {

    // Data member 
    int total_belanja = 0;
    
    //membaut scanner menerima imput dari keyboard
    Scanner scan = new Scanner(System.in);

    //mengambil imput dari keayboard
    System.out.println("masukkan total belanaja : ");
    total_belanja  = scan.nextInt();

    //cek total belanja 
    if(total_belanja >= 50000) {
        System.out.println( "Anda mendapatkan mouse : ");
    } else {
        System.out.println("Belanja Anda Kurang Dari Rp. 50000");
    }
    
        System.out.println( "Belanja anda kurang dari");
   
   
    }

}