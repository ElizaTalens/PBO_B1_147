public class Anabul {
    String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }

    public void suara() throws Exception {
        throw new Exception("Suara tidak didefinisikan");
    }

    public void gerakan() throws Exception {
        throw new Exception("Gerakan tidak didefinisikan");
    }
}