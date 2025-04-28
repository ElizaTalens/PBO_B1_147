/* Nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam class Anjing
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 29 April 2025
 */ 

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi 'Guk-guk'");
    }
}
