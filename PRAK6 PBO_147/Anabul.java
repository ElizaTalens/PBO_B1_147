/* Nama File : Anabul.java
 * Deskripsi : Berisi atribut dan method dalam class Anabul
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 29 April 2025
 */ 

public abstract class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}
