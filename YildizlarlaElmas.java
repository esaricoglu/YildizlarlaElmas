package Donguler;

import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {
        int n;
        // n sayısı, elmasın tam ortasındaki yıldızların bulunduğu basamak sayısıdır.

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir N sayısı giriniz : ");
        n = inp.nextInt();
        int saveN = n;

        //ELMASIN ÜST KISMI
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // ELMASIN ALT KISMI
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");

            }
            for (int j = (2 * saveN) - 3; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            saveN -= 1;
        }
    }
}

