import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;
    public static final int BUP = 65;

     public DosenTetap(String nidn, String nama, String TTL, LocalDate tmt, double gajiPokok, LocalDate tanggalBerakhirKontrak, String fakultas) {
        super(nidn, nama, TTL, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public LocalDate hitungBUP() {
        return getTmt().plusYears(BUP);
    }

    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Status                  : Dosen Tetap");
        System.out.println("NIDN                    : " + nidn);
        System.out.println("BUP                     : " + hitungBUP());
        System.out.println("Tunjangan               : Rp " + String.format("%,.2f", hitungTunjangan()));

    }

}
