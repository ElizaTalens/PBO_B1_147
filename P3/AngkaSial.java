/* Nama File : AngkaSial.java
 * Deskripsi : Berisi atribut dan method dalam class matKul
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 10 Maret 2025
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        }
    }
}

// Pertanyaan: 
// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Jawaban:
// 1. Ketika eksepsi terjadi pada as.cobaAngka(13), program akan langsung masuk ke blok catch, sehingga baris 12 (as.cobaAngka(12)) 
// tidak dieksekusi karena eksekusi telah terhenti akibat pengecualian yang dilempar.
// 2. Baris 21 (System.out.println("Hati-hati memasukkan angka!!!");) 
// Akan dieksekusi karena berada di dalam blok catch, yang menangani pengecualian AngkaSialException. Setelah menangkap eksepsi, 
// program menjalankan perintah dalam blok catch, termasuk mencetak pesan peringatan tersebut.