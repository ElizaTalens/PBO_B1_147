class Persegipanjang extends BangunDatarGenerik<Double> {
    private double panjang;
    private double lebar;

    public Persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public Double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public Double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}