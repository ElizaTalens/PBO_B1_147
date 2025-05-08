/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author eliza
 */
public class Main {
     public static void main(String[] args) {
        // membuat objek Datum dengan tipe Kucing
        Datum<Anabul> datumKucing = new Datum<>(new Kucing());
        Datum<Anabul> datumAnjing = new Datum<>(new Anjing());
        Datum<Anabul> datumBurung = new Datum<>(new Burung());

        // menampilkan suara dan gerakan
        System.out.println("Kucing:");
        datumKucing.getIsi().bergerak();
        datumKucing.getIsi().berbunyi();

        System.out.println("\nAnjing:");
        datumAnjing.getIsi().bergerak();
        datumAnjing.getIsi().berbunyi();

        System.out.println("\nBurung:");
        datumBurung.getIsi().bergerak();
        datumBurung.getIsi().berbunyi();
    }
}
