package com.dicoding.javafundamental.percabangan;

public class IfThen {
    public static void main(String[] args) {
        boolean isOn = true;
        if (isOn) {
            System.out.println( "Menyalakan lampu" );
        }
    }

    boolean isOn = true;
    void ganti() {
        if (isOn) {
            System.out.println("Menyalakan lampu");
            System.out.println("Menyalakan lampu lain");
        }
    }
}
