class Persegi extends BangunDatarGenerik<Double> {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public Double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public Double hitungKeliling() {
        return 4 * sisi;
    }
}