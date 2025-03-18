import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Pegawai
        Pegawai pegawai1 = new Pegawai("111222333", "Siti", "Jakarta, 10 Juni 1985", LocalDate.of(2010, 1, 1), 4000000);
        System.out.println("======= Pegawai =======");
        pegawai1.printInfo();

        System.out.println("=======================");

        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("222333444", "Rizky", "Yogyakarta, 15 Maret 1980", LocalDate.of(2008, 7, 1), 6000000, "Fakultas Ekonomi");
        System.out.println("======= Dosen =======");
        dosen1.printInfo();

        System.out.println("=======================");

        // Membuat objek Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", "Bandung, 5 Mei 1990", LocalDate.of(2015, 1, 1), 5000000, LocalDate.of(2045, 5, 1), "Fakultas Sains dan Matematika");
        System.out.println("======= Dosen Tetap =======");
        dosenTetap.printInfo();

        System.out.println("=======================");

        // Membuat objek Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu("9876543210", "Budi", "Surabaya, 12 Desember 1985", 
        LocalDate.of(2020, 2, 1), 4500000, "5678321", LocalDate.of(2025, 6, 30), "Fakultas Teknik");
        System.out.println("======= Dosen Tamu =======");
        dosenTamu.printInfo();

        System.out.println("=======================");

        // Membuat objek Tendik
        Tendik tendik = new Tendik("1234567890", "Citra", "Malang, 10 Juni 1985", LocalDate.of(2010, 1, 1), 4000000, "Kemahasiswaan");
        System.out.println("======= Tendik =======");
        tendik.printInfo();
    }
}
