/* Nama File : Kucing.java
 * Deskripsi : Berisi atribut dan method dalam class Kucing
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 29 April 2025
 */ 

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi 'Meong'");
    }
}
