import java.util.Scanner;
public class TugasBioskop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int hargaTiket = 50000;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan ulang!\n");
                continue;
            }
            double totalHargaTransaksi = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }
            double hargaBayar = totalHargaTransaksi - (totalHargaTransaksi * diskon);
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaBayar;

            System.out.println("Harga bayar untuk transaksi ini: Rp " + hargaBayar);
            System.out.println("----------------------------------------");
        }
        
        System.out.println("\n================ REKAP PENJUALAN TIKET HARI INI ================");
        System.out.println("Total tiket terjual hari ini : " + totalTiketTerjual + " tiket");
        System.out.println("Total harga penjualan tiket   : Rp " + totalPenjualan);
    }
}