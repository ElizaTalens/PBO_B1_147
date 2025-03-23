// Nama File    : Manusia.java
// Deskripsi    : Berisi atribut dan method dalam class Super Manusia
// Pembuat      : Eliza Talent Sirait / 24060123140147
// Tanggal      : 23 Maret 2025

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    } 

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns++;
    }

    // Method
    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
    }

    public void cetakInfo() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Alamat      : " + getAlamat());
        System.out.println("Masa Kerja  : " + hitungMasaKerja() + " tahun");
        System.out.println("Pendapatan  : Rp " + String.format("%,.0f", getPendapatan()));
    }
}

