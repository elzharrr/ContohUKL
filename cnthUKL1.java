package cnthukl;

import java.util.Scanner;

public class cnthUKL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hasil = 0;
        System.out.println("=====Zel Ekspedisi=====");
        System.out.println("Selamat datang di layanan Ekspedisi kami!");
        System.out.print("Masukkan berat barang (kg): ");
        int berat = input.nextInt();
        System.out.println("Masukan jarak tempuh pengiriman (km): ");
        int jarak = input.nextInt();
        System.out.println("Masukkan Panjang Barang (m): ");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar Barang (m): ");
        int lebar = input.nextInt();
        System.out.println("Masukkan Tinggi Barang (m): ");
        int tinggi = input.nextInt();

        if(jarak < 10 || jarak == 10) {
            hasil += 4250 * berat;
        }else if(jarak > 10) {
            hasil += 6000 * berat;
        }
        int volume = panjang * lebar * tinggi;
        if (volume > 100) {
            hasil += 50000;
        }

        System.out.println("Total biaya pengiriman: Rp " + hasil);
    }
}
