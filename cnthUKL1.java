package cnthukl;

import java.util.Scanner;

public class cnthUKL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Berat Paket (kg): ");
        double berat = scanner.nextDouble();

        System.out.println("Masukkan Jarak Pengiriman (km): ");
        double jarak = scanner.nextDouble();

        System.out.println("Masukkan Volume Paket (cm3): ");
        double volume = scanner.nextDouble();

        double biayaPerKG; 
        if ( jarak <= 10 ) {
            biayaPerKG = 4250;
        } else {
            biayaPerKG = 6000;
        }

        double biayaVolume = 0;
        if ( volume > 100 ); {
            biayaVolume = 50000;
        }

        double totalBiaya = (biayaPerKG * berat) + biayaVolume;

        System.out.println("Total Biaya Pengiriman: Rp " + totalBiaya);
    }
}
