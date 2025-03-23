// Nama File    : Pengusaha.java
// Deskripsi    : Berisi atribut dan method dalam class Pengusaha
// Pembuat      : Eliza Talent Sirait / 24060123140147
// Tanggal      : 23 Maret 2025

import java.time.LocalDate;

class Pengusaha extends Manusia implements IPajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter dan Setter
    public String getNPWP() {
        return npwp;
    }

    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Method
    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    @Override
    public long hitungMasaKerja() {
        return super.hitungMasaKerja() + 4; // B = 4
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP        : " + getNPWP());
        System.out.println(("Pajak pengusaha: " + hitungPajak()));
    }
}

