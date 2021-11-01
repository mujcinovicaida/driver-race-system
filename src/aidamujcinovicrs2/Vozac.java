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
public class Vozac {
    private int id;
    private String ime;
    private String prezime;
    private int godiste;
    private int idVozilo;

    public Vozac(String ime, String prezime, int godiste, int idVozilo) {
        this.ime = ime;
        this.prezime = prezime;
        this.godiste = godiste;
        this.idVozilo = idVozilo;
    }

    public Vozac() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public int getIdVozilo() {
        return idVozilo;
    }

    public void setIdVozilo(int idVozilo) {
        this.idVozilo = idVozilo;
    }
    
    
}
