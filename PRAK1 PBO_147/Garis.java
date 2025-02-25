/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 24 Februari 2025
 */
package P1;

public class Garis {
    // Atribut
    Titik Tawal;
    Titik Takhir;
    static int counterGaris = 0;

    // Method 
    Garis() {
        Tawal = new Titik (0,0);
        Takhir = new Titik (1, 1);
        ++counterGaris;
    }

    Garis(Titik Tawal, Titik Takhir) {
        this.Tawal = Tawal;
        this.Takhir = Takhir;
        counterGaris++;
    }

     // Mengembalikan nilai counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    // Mengembalikan nilai titik awal garis
    public Titik getAwal() {
        return Tawal;
    }

    // Mengembalikan nilai titik akhir garis
    public Titik getAkhirTitik() {
        return Takhir;
    }

    // Mengeset nilai titik awal dengan nilai titik baru
    public void setTAwal(Titik awal) {
        this.Tawal = awal;
    }

    // Mengeset nilai titik akhir dengan nilai titik baru
    public void setTAkhir(Titik akhir) {
        this.Takhir = akhir;
    }

    // Menghitung panjang sebuah garis
    public double panjangGaris() {
        double x = Takhir.getAbsis() - Tawal.getAbsis();
        double y = Takhir.getOrdinat() - Tawal.getOrdinat();
        return Math.sqrt(x*x + y*y);
    }

    // Menghitung gradien garis
    public double getGradien() {
        double ym = Takhir.getOrdinat() - Tawal.getOrdinat();
        double xm = Takhir.getAbsis() - Tawal.getOrdinat();

        if (xm == 0) {
            return Double.POSITIVE_INFINITY; 
        }
        return ym/xm;
    }

    // Menghitung titik tengah dari sebuah garis
    Titik titikTengah() {
        return new Titik ((Tawal.getAbsis() + Takhir.getAbsis()) / 2, (Tawal.getOrdinat() + Takhir.getOrdinat()) / 2);
    }

    // Mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya
    boolean IsSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika tegak lurus dan false jika sebaliknya
    boolean IsTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan ke layar titik awal dan titik akhir garis
    void printGaris() {
        System.out.println("Garis dari " + "(" + Tawal.getAbsis() + "," + Tawal.getOrdinat() + ") ke (" 
                           + Takhir.getAbsis() + "," + Takhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx+c
    String persamaanGaris() {
        double m = getGradien();
         if (Double.isInfinite(m)) { 
            return "x = " + Tawal.getAbsis(); 
        }

        double c = Tawal.getOrdinat() - (m * Tawal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}
