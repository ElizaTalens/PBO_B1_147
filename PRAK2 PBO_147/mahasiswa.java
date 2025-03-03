/* Nama File : mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class mahasiswa
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 2 Maret 2025
 */

package P2;

import java.util.ArrayList;

public class mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList <matKul> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getNIM(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void addMataKuliah(matKul matKul) {
            listMatKul.add(matKul);
        }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (matKul mk : listMatKul) {
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printDetailMhs() {
        // Menampilkan informasi mahasiswa
        System.out.println("Mahasiswa : " + nim + " - " + nama + " - " + prodi);
    
        // Menampilkan informasi dosen wali 
        System.out.println("Dosen Wali : " + dosenWali.getNama() + " - " + dosenWali.getNIP() + " - " + dosenWali.getProdi());
        
    
        // Menampilkan informasi kendaraan 
        System.out.println("Kendaraan : " + kendaraan.getJenisKendaraan() + " - " + kendaraan.getNoPlat());
    
        // Menampilkan daftar mata kuliah yang diambil
        System.out.println("Mata Kuliah yang diambil :");
            for (matKul mk : listMatKul) {
                System.out.println(" - " + mk.getNama() + " (" + mk.getSKS() + " SKS)");
            }
    }
}



