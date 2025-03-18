import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidang;
    private static final int BUP = 55;

    public Tendik(String nip, String nama, String TTL, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, TTL, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    
    public LocalDate hitungBUP() {
        return getTmt().plusYears(BUP);
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * getGajiPokok();
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan                 : Tendik");
        System.out.println("Bidang                  : " + bidang);
        System.out.println("BUP                     : "  + hitungBUP());
        System.out.println("Tunjangan               : Rp " + String.format("%,.2f", hitungTunjangan()));

    }
}
