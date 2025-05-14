import java.util.ArrayList;

class KoleksiAnabul {
    private ArrayList<Anabul> koleksi;

    public KoleksiAnabul() {
        koleksi = new ArrayList<>();
    }

    public void add(Anabul anabul) throws Exception {
        if (anabul == null) {
            throw new Exception("Tidak dapat menambahkan objek kosong ke koleksi");
        }
        koleksi.add(anabul);
    }

    public void showAll() throws Exception {
        if (koleksi.isEmpty()) {
            throw new Exception("Koleksi kosong");
        }
        for (Anabul a : koleksi) {
            System.out.println("Nama: " + a.nama);
            a.suara();
            a.gerakan();
            System.out.println();  
        }
    }
}