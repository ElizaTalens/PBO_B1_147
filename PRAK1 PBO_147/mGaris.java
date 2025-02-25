/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 24 Februari 2025
 */
package P1;

public class mGaris {
     public static void main(String[] args) {
        System.out.println("========== Membuat Objek Titik ==========");
        // Membuat titik T1
        System.out.println("Titik T1: ");
        Titik T1 = new Titik();
        T1.setAbsis(5);
        T1.setOrdinat(4);
        T1.printTitik();

        // Membuat titik T2
        System.out.println("Titik T2: ");
        Titik T2 = new Titik();
        T1.setAbsis(-3);
        T1.setOrdinat(7);
        T1.printTitik();

        // Membuat titik T3
        System.out.println("Titik T3: ");
        Titik T3 = new Titik();
        T1.setAbsis(2);
        T1.setOrdinat(5);
        T1.printTitik();

        // Membuat titik T4
        System.out.println("Titik T4: ");
        Titik T4 = new Titik();
        T1.setAbsis(-9);
        T1.setOrdinat(2);
        T1.printTitik();

        System.out.println("========== Membuat Objek Garis ==========");
        // Membuat garis dengan dua titik
        Garis garis1 = new Garis(T1, T2);
        Garis garis2 = new Garis(T3, T4);
        garis1.printGaris();
        garis2.printGaris();

        // Menghasilkan panjang sebuah garis 
        System.out.println("\nPanjang garis setiap garis:");
        System.out.println("Panjang garis1: " + garis1.panjangGaris());
        System.out.println("Panjang garis2: " + garis2.panjangGaris());

        // Menghasilkan gradien dari sebuah garis
        System.out.println("\nGradien dari setiap garis:");
        System.out.println("Gradien garis1: " + garis1.getGradien());
        System.out.println("Gradien garis2: " + garis2.getGradien());

        // Menghasilkan titik tengah dari sebuah garis
        System.out.println("\nTitik tengah garis:");
        System.out.println("Titik tengah garis1: " + garis1.titikTengah().getAbsis() + ", " + garis1.titikTengah().getOrdinat());
        System.out.println("Titik tengah garis2: " + garis2.titikTengah().getAbsis() + ", " + garis2.titikTengah().getOrdinat());

        // Mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
        System.out.println("\nCek apakah garis sejajar?");
        System.out.println("Apakah garis1 sejajar?: " + garis1.IsSejajar(garis2));

        // Mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
        System.out.println("\nCek apakah garis tegak lurus?");
        System.out.println("Apakah garis T1 dan T2 lurus?: " + garis1.IsTegakLurus(garis2));

        // Menampilkan ke layar titik awal dan tiik akhir garis
        System.out.println("\nTitik awal dan titik akhir untuk setiap garis:");
        System.out.println("Garis1: Titik awal (" + T1.getAbsis() + ", " + T1.getOrdinat() + "), Titik akhir (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
        System.out.println("Garis2: Titik awal (" + T3.getAbsis() + ", " + T3.getOrdinat() + "), Titik akhir (" + T4.getAbsis() + ", " + T4.getOrdinat() + ")");

        // Menampilkan persamaan garis
        System.out.println("\nHasil persamaan garis dalam bentuk y = mx + c:");
        System.out.println("Persamaan garis y = mx + c: " + garis1.persamaanGaris());
        System.out.println("Persamaan garis y = mx + c: " + garis2.persamaanGaris());
    }
}
