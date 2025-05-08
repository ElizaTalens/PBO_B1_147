/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMedium;

/**
 *
 * @author eliza
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;  
        this.peluru = 0;  
    }

    // Getter & Setter
    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
}
