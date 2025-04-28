/* Nama File : Main.java
 * Deskripsi : Berisi atribut dan method dalam class Main
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 29 April 2025
 */  

public class Main {
    public static void main(String[] args) {
        Anabul[] daftarAnabul = {
            new Kucing("Kucing sphynx"),
            new Anjing("Anjing bulldog"),
            new Burung("Burung merpati")
        };

        for (Anabul anabul : daftarAnabul) {
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }
    }
}
