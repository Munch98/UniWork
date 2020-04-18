package org.example;

public class Produktbeskrivelse {
    private String produktID;

    public Produktbeskrivelse(String produktID, String beskrivelse, double pris, int standardMængde, int antalPåLager) {
        this.produktID = produktID;
        this.beskrivelse = beskrivelse;
        this.pris = pris;
        this.standardMængde = standardMængde;
        this.antalPåLager = antalPåLager;
    }

    private String beskrivelse;
    private double pris;
    private int standardMængde;
    private int antalPåLager;

    public double hentPris(){
        return 0;
    };
    public int hentMængde (){
        return 0;
    };
}
