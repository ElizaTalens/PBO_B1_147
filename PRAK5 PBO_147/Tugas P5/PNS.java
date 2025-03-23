// Nama File    : PNS.java
// Deskripsi    : Berisi atribut dan method dalam class PNS
// Pembuat      : Eliza Talent Sirait / 24060123140147
// Tanggal      : 23 Maret 2025

import java.time.LocalDate;

public class PNS extends Manusia implements IPajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter dan Setter
    public String getNIP() {
        return nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    // Method
    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    @Override
    public long hitungMasaKerja() {
        return super.hitungMasaKerja() + 7; // A = 7
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP         : " + getNIP());
        System.out.println("Pajak PNS   : " + hitungPajak());
    }
}
