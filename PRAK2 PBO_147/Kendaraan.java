/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 2 Maret 2025
 */

package P2; 

public class Kendaraan {
    private String noPlat;
    private String jenisKendaraan;

    public Kendaraan (String noPlat, String jenisKendaraan) {
        this.noPlat = noPlat;
        this.jenisKendaraan = jenisKendaraan;
    }
    
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
}
  