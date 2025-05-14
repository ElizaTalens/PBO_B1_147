public class Anjing extends Anabul {
     public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " bersuara 'Guk-guk");
    }

    @Override
    public void gerakan() {
        System.out.println(nama + " bergerak dengan melata");
    }
}

