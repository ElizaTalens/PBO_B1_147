public class Main {
    public static void main(String[] args) {
        KoleksiAnabul koleksiAnabul = new KoleksiAnabul();
        try {
            koleksiAnabul.add(new Kucing("Amer"));
            koleksiAnabul.add(new Anjing("Toty"));
            koleksiAnabul.add(new Burung("Lano"));
            koleksiAnabul.showAll();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}