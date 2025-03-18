import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen (String nip, String nama, String TTL, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, TTL, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan                 : Dosen");
        System.out.println("Fakultas                : " + fakultas);
    }
}

