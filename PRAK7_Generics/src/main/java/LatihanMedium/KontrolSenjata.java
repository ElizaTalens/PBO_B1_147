/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMedium;

/**
 *
 * @author eliza
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public void menembak(int jumlah) {
        if (senjata.isMenusuk() && senjata.getPeluru() >= jumlah) {
            senjata.setPeluru(senjata.getPeluru() - jumlah); 
            System.out.println(">> Siap menembak " + jumlah + " kali");
        } else {
            System.out.println(">> Gagal tembak, Peluru Habis");
        }
    }

    public void isiPeluru(int peluru) {
        senjata.setPeluru(senjata.getPeluru() + peluru); 
        senjata.setMenusuk(true); 
        System.out.println(">> Peluru berhasil ditambah: " + peluru);
    }
}
