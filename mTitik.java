package P1;
/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 22 Februari 2025
 */

 public class mTitik {
    public static void main(String[] args) {
        System.out.println("========== Membuat Objek Titik ==========");

        // Membuat titik T1
        System.out.println("Titik T1: ");
        Titik T1 = new Titik();
        T1.setAbsis(-3);
        T1.setOrdinat(-4);
        T1.printTitik();

        System.out.println("Titik geser T1: ");
        T1.geser(1, 2);
        T1.printTitik();

        // Membuat titik T2
        System.out.println("\nTitik T2: ");
        Titik T2 = new Titik();
        T2.setAbsis(5);
        T2.setOrdinat(10);
        T2.printTitik();

        System.out.println("Titik geser T2: ");
        T2.geser(3, 4);
        T2.printTitik();

        // Membuat titik T3
        System.out.println("\nTitik T3: ");
        Titik T3 = new Titik(-5, -10);
        T3.printTitik();

        System.out.println("Titik geser T3: ");
        T3.geser(2, 1);
        T3.printTitik();        

        // Menampilkan kuadran titik
        System.out.println("\nKuadran dari tiap titik:");
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("Kuadran T3: " + T3.getKuadran());
        
        // Menampilkan jarak ke pusat koordinat
        System.out.println("\nJarak titik ke pusat koordinat:");
        System.out.println("Jarak Pusat T1: " + T1.getJarakPusat());
        System.out.println("Jarak Pusat T2: " + T2.getJarakPusat());
        System.out.println("Jarak Pusat T3: " + T3.getJarakPusat());

        // Menampilkan jarak antara dua titik
        System.out.println("\nJarak antara dua titik:");
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));
        System.out.println("Jarak antara T2 dan T3: " + T2.getJarak(T3));


        // Menampilkan hasil refleksi X untuk mengubah objek asli
        System.out.println("\nRefleksi terhadap sumbu X:");
        T1.refleksiX();
        System.out.println("T1 setelah refleksiX():");
        T1.printTitik();

        T2.refleksiX();
        System.out.println("T2 setelah refleksiX():");
        T2.printTitik();

        T3.refleksiX();
        System.out.println("T3 setelah refleksiX():");
        T3.printTitik();

        // Menampilkan hasil get refleksi X sebagai objek baru 
        System.out.println("\nHasil refleksi terhadap sumbu X sebagai objek baru:");
        Titik refleksiT1X = T1.getRefleksiX();
        System.out.println("T1X hasil getRefleksiX(): ");
        refleksiT1X.printTitik(); 

        Titik refleksiT2X = T2.getRefleksiX();
        System.out.println("T2X hasil getRefleksiX(): ");
        refleksiT2X.printTitik();

        Titik refleksiT3X = T3.getRefleksiX();
        System.out.println("T3X hasil getRefleksiX(): ");
        refleksiT3X.printTitik();

        //  Menampilkan hasil refleksiY() untuk mengubah objek asli
        System.out.println("\nRefleksi terhadap sumbu Y:");
        T1.refleksiY();
        System.out.println("T1 setelah refleksiY():");
        T1.printTitik();

        T2.refleksiY();
        System.out.println("T2 setelah refleksiY():");
        T2.printTitik();

        T3.refleksiY();
        System.out.println("T3 setelah refleksiY():");
        T3.printTitik();

        // Menampilkan hasil get refleksi Y sebagai objek baru 
        System.out.println("\nHasil refleksi terhadap sumbu Y sebagai objek baru:");
        Titik refleksiT1Y = T1.getRefleksiY();
        System.out.println("T1Y hasil getRefleksiY(): ");
        refleksiT1Y.printTitik(); 

        Titik refleksiT2Y = T2.getRefleksiY();
        System.out.println("T2Y hasil getRefleksiY(): ");
        refleksiT2Y.printTitik();

        Titik refleksiT3Y = T3.getRefleksiY();
        System.out.println("T3Y hasil getRefleksiY(): ");
        refleksiT3Y.printTitik();
    }
}