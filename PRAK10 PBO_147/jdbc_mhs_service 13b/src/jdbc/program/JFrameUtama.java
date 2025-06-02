package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

import java.util.List;

public class JFrameUtama {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        System.out.println("Koneksi berhasil\n");

        // === insert ===
        System.out.println("===insert");
        System.out.println("Berhasil insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        System.out.println("===displayAll");
        displayAll();

        // === update ===
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        if (mhsUpdate != null) {
            System.out.println("Akan diupdate data lama: " + mhsUpdate);
            mhsUpdate.setNama("Dinaya");
            System.out.println("dengan data baru: " + mhsUpdate);
            service.update(mhsUpdate);
            System.out.println("Berhasil update");
        }
        System.out.println("===displayAll");
        displayAll();

        // === delete ===
        System.out.println("===delete");
        Mahasiswa mhsDelete = service.getById(5);
        if (mhsDelete != null) {
            System.out.println("akan di delete: " + mhsDelete);
            service.delete(5);
            System.out.println("Berhasil delete");
        }
        System.out.println("===displayAll");
        displayAll();
    }

    public static void displayAll() {
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
        System.out.println();
    }
}
