package cnthukl;

import java.util.Scanner;

class cnthUKL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long faktorial = 1; // menggunakan long agar bisa menampung nilai besar

        System.out.print("Masukkan bilangan bulat positif: ");
        n = input.nextInt();

        if (n < 0) {
            System.out.println("Maaf, faktorial hanya dapat dihitung untuk bilangan positif.");
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}