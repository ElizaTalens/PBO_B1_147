/* Nama File : Asersi2.java
 * Deskripsi : Berisi atribut dan method dalam class Asersi2
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 10 Maret 2025
 */

// class lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
// class Asersi2
public class Asersi2{
        public static void main (String[] args) {
            double jariJari = 0;
            assert(jariJari>0): "Jari jari tidak boleh nol!!!";
            Lingkaran l = new Lingkaran(jariJari);
            double kelilingLingkaran = l.hitungKeliling();
            System.out.println("keliling lingkaran = "
                +kelilingLingkaran);
        } 
}

// Pertanyaan: 
// secara konsep, ada yang kurang tepat pada program asersi2 diatas. jelaskan pada lembar laporan praktikum!
// Jawaban:
// Program Asersi2.java memiliki kesalahan konsep karena assertion tidak diaktifkan secara default, 
// sehingga jika dijalankan tanpa opsi -ea, pengecekan assert (jariJari > 0) tidak akan berfungsi. 
// Akibatnya, objek Lingkaran tetap dibuat dengan jariJari = 0, 
// menghasilkan keliling 0.0, yang tidak valid. Assertion juga tidak seharusnya digunakan sebagai satu-satunya validasi. 
// Solusinya, tambahkan pengecekan dengan if sebelum membuat objek, dan jika jariJari <= 0, 
// lempar IllegalArgumentException agar program lebih aman dan tetap valid tanpa bergantung pada assertion.

