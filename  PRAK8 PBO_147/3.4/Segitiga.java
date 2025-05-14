class Segitiga extends BangunDatarGenerik<Double> {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public Double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public Double hitungKeliling() {
        return alas * 3; 
    }
}