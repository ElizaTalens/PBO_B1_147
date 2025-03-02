/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class MMahasiswa
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 2 Maret 2025
 */

package P2;

public class MMahasiswa {
    public static void main(String[] args){
        // Membuat objek mahasiswa
        mahasiswa M1 = new mahasiswa("00147", "Eliza  Sirait", "Informatika");
        mahasiswa M2 = new mahasiswa("00285", "Charles HW", "Informatika");

        // Membuat objek dosen 
        Dosen D1 = new Dosen("D0089", "Dr. Helmie", "Informatika");
        Dosen D2 = new Dosen("D0092", "Dr. Ahmad", "Informatika");
        M1.setDosenWali(D1);
        M2.setDosenWali(D2);

        // Membuat objek kendaraan
        Kendaraan K1 = new Kendaraan("E 168 SR", "Mobil");
        Kendaraan K2 = new Kendaraan("B 88 HW", "Mobil");
        M1.setKendaraan(K1);
        M2.setKendaraan(K2);

        // membuat objek mata kuliah
        matKul MK1 = new matKul("MK001", "Algoritma Pemrograman", 3);
        matKul MK2 = new matKul("MK002", "Basis Data", 4);
        matKul MK3 = new matKul("MK003", "Pemrograman Berbasis Orientasi Objek", 3);
        matKul MK4 = new matKul("MK004", "Statistika", 2);
        matKul MK5 = new matKul("MK005", "Aljabar Linear", 3);
        
        M1.addMataKuliah(MK1);
        M1.addMataKuliah(MK4);
        M1.addMataKuliah(MK5);

        M2.addMataKuliah(MK2);
        M2.addMataKuliah(MK3);
        M2.addMataKuliah(MK5);
        M2.addMataKuliah(MK4);

        //Menampilkan informasi mahasiswa1
        System.out.println("========== Data Mahasiswa ==============");
        System.out.println("Detail Mahasiswa1 :");
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan total SKS
        System.out.println("Total Mata Kuliah yang diambil : " + M1.getJumlahMatKul());
        System.out.println("Total SKS yang diambil : " + M1.getJumlahSKS());
        System.out.println("========================================\n");

        //Menampilkan informasi mahasiswa2
        System.out.println("Detail Mahasiswa2 :");
        M2.printDetailMhs();
        
        // Menampilkan jumlah mata kuliah dan total SKS
        System.out.println("Total Mata Kuliah yang diambil : " + M2.getJumlahMatKul());
        System.out.println("Total SKS yang diambil : " + M2.getJumlahSKS());
        System.out.println("========================================");
    }
}
