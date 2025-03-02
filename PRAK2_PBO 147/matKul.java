/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class matKul
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 2 Maret 2025
 */

package P2;

public class matKul {
    private String idMatKul;
    private String nama;
    private int sks;

    public matKul(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String  getIdMatKul() {
        return idMatKul;
    }

    public String  getNama() {
        return nama;
    }

    public int getSKS() {
        return sks;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }

}


