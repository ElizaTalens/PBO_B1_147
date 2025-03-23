// Nama File    : Petani.java
// Deskripsi    : Berisi atribut dan method dalam class Petani
// Pembuat      : Eliza Talent Sirait / 24060123140147
// Tanggal      : 23 Maret 2025

import java.time.LocalDate;

class Petani extends Manusia implements IPajak {
    private String asal_kota;
    private static int counterPetani = 0; 

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Getter dan Setter
    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    // Method
    @Override
    public double hitungPajak() {
        return 0; // Pajak petani = 0
    }

    @Override
    public long hitungMasaKerja() {
        return super.hitungMasaKerja() + 1; // C = 1
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal kota   : " + getAsalKota());
        System.out.println("Pajak Petani: " + hitungPajak());
    }
}
