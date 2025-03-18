import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pegawai {
    private String nip, nama, TTL;
    private LocalDate tmt;
    private double gajiPokok;

    public Pegawai(String nip, String nama, String TTL, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.TTL = TTL;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Getter dan Setter
    public String getNIP() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getTTL() {
        return TTL;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tmt, LocalDate.now());
    }

    public void printInfo() {
        System.out.println("NIP                     : " + nip);
        System.out.println("Nama                    : " + nama);
        System.out.println("Tempat dan Tanggal Lahir: " + TTL); 
        System.out.println("TMT                     : " + tmt);
        System.out.println("Masa Kerja              : " + hitungMasaKerja() + " tahun");
        System.out.println("Gaji Pokok              : Rp " + String.format("%,.2f", gajiPokok));
    }
}
