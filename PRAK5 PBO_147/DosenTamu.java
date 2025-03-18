import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
        private String nidk;
        private LocalDate tanggalBerakhirKontrak;

    public DosenTamu(String nip, String nama, String TTL, LocalDate tmt, double gajiPokok, String nidk, LocalDate tanggalBerakhirKontrak, String fakultas) {
        super(nip, nama, TTL, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public int hitungMasaKontrak() {
        return Period.between(LocalDate.now(), tanggalBerakhirKontrak).getMonths();

    }

    public double hitungTunjangan() {
        return 0.025 * hitungMasaKerja() * getGajiPokok();
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Status                  : Dosen Tamu");
        System.out.println("NIDK                    : " + nidk);
        System.out.println("Masa Kontrak            : " + hitungMasaKontrak() + " bulan");
        System.out.println("Tunjangan               : Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}
  