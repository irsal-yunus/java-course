package com.dicoding.javafundamental.inputouput;

public class UserOutput {
    public static void main (String[] args) {
        System.out.println("Dicetak pakai println()");
        System.out.println("Ini juga dicetak pakai println()");
        System.out.print("Ini dicetak dengan print()");
        System.out.print(" dan ini juga dicetak dengan print()");
        // Type data string
        String greeting = "Hello World!";

        // Type data array character
        char[] dicodingChars = { 'd', 'i', 'c', 'o', 'd', 'i', 'n', 'g' };
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);

        // Mengetahui Panjang String
        String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);

        // Mengambil Karakter Dari Sebuah String

        char result = dicoding.charAt(7);
        System.out.println(result);
    }
}
