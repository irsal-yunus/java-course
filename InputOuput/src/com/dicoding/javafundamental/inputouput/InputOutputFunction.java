package com.dicoding.javafundamental.inputouput;
import java.util.Scanner;
public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan sangat sederhana");
        System.out.print("Masukkan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukkan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);

    }
}
