/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aidamujcinovicrs2;

/**
 *
 * @author User
 */
public class Vozilo {
    private int id;
    private String marka;
    private String tip;
    private String gorivo;
    private int broj;

    public Vozilo() {
    }

    public Vozilo(String marka, String tip, String gorivo, int broj) {
        this.marka = marka;
        this.tip = tip;
        this.gorivo = gorivo;
        this.broj = broj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }
    
    
}
