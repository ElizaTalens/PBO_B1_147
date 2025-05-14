public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();
        for (char i = 'A'; i < 'K'; i++) {
            koleksiKarakter.add(i);
        }
        koleksiKarakter.showAll();
    }
}