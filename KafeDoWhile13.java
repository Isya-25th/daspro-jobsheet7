import java.util.Scanner;

public class KafeDoWhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000;
        int totalharga; 
        do { 
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            String nama = sc.nextLine();
            if (nama.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break; 
            }
            System.out.print("Jumlah kopi: ");
            int kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            int teh = sc.nextInt();
            System.out.print("Jumlah roti:");
            int roti = sc.nextInt();
            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total harga untuk " + nama + " adalah: Rp " + totalharga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
    
}
