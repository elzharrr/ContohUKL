package cnthukl;

import java.util.Scanner;

public class cnthUKL5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0; // gunakan double untuk akurasi desimal
        double nilai;

        // perulangan untuk input nilai setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // hitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n=== Rekap Nilai Siswa Produktif RPL ===");
        System.out.println("Jumlah Siswa: " + jumlahSiswa);
        System.out.println("Total Nilai : " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}