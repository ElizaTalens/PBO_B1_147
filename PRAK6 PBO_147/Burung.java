/* Nama File : Burung.java
 * Deskripsi : Berisi atribut dan method dalam class Burung
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 29 April 2025
 */  

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi 'Cuit'");
    }
}
