package P1;
/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 22 Februari 2025
 */


public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Behavior/Method */

    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }
    
    //Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Menghitung nilai kuadran titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;  
        } else if (absis < 0 && ordinat > 0) {
            return 2;  
        } else if (absis < 0 && ordinat < 0) {
            return 3; 
        } else if (absis > 0 && ordinat < 0) {
            return 4;  
        } else {
            return 0;  
        }
    }

    // Menghitung nilai jarak dari titik pusat ke koordinat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Menghitung jarak antara dua titik
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.absis - T.getAbsis(), 2) + Math.pow(this.ordinat - T.getOrdinat(), 2));
    }

    // Menghitung nilai refleksiX
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Mendapatkan objek titik baru hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Menghitung nilai refleksiY
    public void refleksiY() {
        this.absis = -this.absis;
    }
    // Mendapatkan objek titik baru hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}