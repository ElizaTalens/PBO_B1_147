/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 2 Maret 2025
 */

package P2;

public class Dosen {
    private String NIP;
    private String Nama;
    private String Prodi;

    public Dosen (String Nama, String NIP, String Prodi) {
        this.Nama = Nama;
        this.NIP = NIP;
        this.Prodi = Prodi;
    }

    public String getNIP() {
        return NIP;
    }
    
    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
}
