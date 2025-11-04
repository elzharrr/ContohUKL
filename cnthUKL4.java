package cnthukl;

import java.util.Scanner;

public class cnthUKL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari jari tabung : ");
        int r = input.nextInt();
        System.out.println("Masukkan tinggi tabung : ");
        int t = input.nextInt();

        double phi = 3.14159;
        double volume = (phi) * r * r * t;
        System.out.println("Volume tabung adalah : " + volume);
    }
} 
