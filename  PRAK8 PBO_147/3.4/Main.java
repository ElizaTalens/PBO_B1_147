public class Main {
    public static void main(String[] args) {
        BangunDatarGenerik<Double> persegi = new Persegi(4);
        System.out.println("\n=== Hitung Persegi ===========");
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        System.out.println("\n=== Hitung Persegi Panjang ===");
        BangunDatarGenerik<Double> persegiPanjang = new Persegipanjang(4, 6);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        System.out.println("\n=== Hitung Segitiga ==========");
        BangunDatarGenerik<Double> segitiga = new Segitiga(4, 6);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}
