package cnthukl;

import java.util.Scanner;

public class cnthUKL2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input bilangan dari pengguna
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scanner.nextInt();
        
        // Mengecek apakah bilangan genap atau ganjil
        if (bilangan %  2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
    }
}
