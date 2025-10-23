import java.util.Scanner;

public class Tugas1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        int totalPendapatan = 0;
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik -1 untuk keluar): ");
            int jumlahTiket = sc.nextInt();
            if (jumlahTiket == -1) {
                break; 
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Silakan masukkan jumlah tiket yang benar.");
                continue; 
            }
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            double totalHarga = jumlahTiket * hargaTiket * (1 - diskon);
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;
            System.out.println("Total harga untuk " + jumlahTiket + " tiket adalah: Rp " + totalHarga);
        }
        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);

        
        sc.close();
    }
}