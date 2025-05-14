import java.util.ArrayList;

class Koleksi<T> {
    private ArrayList<T> wadah;
    private int nbelm;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public void setIsi(ArrayList<T> isi) {
        this.wadah = isi;
        this.nbelm = isi.size();
    }

    public ArrayList<T> getIsi() {
        return this.wadah;
    }

    public int getSize() {
        return this.nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T element) {
        wadah.add(element);
        nbelm++;
    }

    public void delete(T element) {
        wadah.remove(element);
        nbelm--;
    }

    public void showAll() {
        for (T elem : wadah) {
            System.out.println(elem);
        }
    }
}