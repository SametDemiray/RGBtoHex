package org.example;
/*
Bu program, kullanıcıdan RGB renk kodunu alır ve bu kodu Hex renk koduna dönüştürür.
Sonuç olarak, Hex renk kodunu ekrana basar. Tek yapmanız gereken programı çalıştırmak ve RGB renk kodunu girmektir.
Örnek
RGB renk kodunu girin (örneğin, 255 0 0): 0 128 255
Hex renk kodu: #0080ff
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("RGB renk kodunu girin (örneğin, 255 0 0): ");
        int red = scanner.nextInt();
        int green = scanner.nextInt();
        int blue = scanner.nextInt();

        String hexColor = rgbToHex(red, green, blue);
        System.out.println("Hex renk kodu: #" + hexColor);
    }

    public static String rgbToHex(int red, int green, int blue) {
        String hexRed = Integer.toHexString(red);
        String hexGreen = Integer.toHexString(green);
        String hexBlue = Integer.toHexString(blue);

        // Hexadecimal değerler iki haneli olmalı, gerekirse başına sıfır ekleyin
        hexRed = padZero(hexRed);
        hexGreen = padZero(hexGreen);
        hexBlue = padZero(hexBlue);

        return hexRed + hexGreen + hexBlue;
    }

    public static String padZero(String hex) {
        return hex.length() == 1 ? "0" + hex : hex;
    }
}