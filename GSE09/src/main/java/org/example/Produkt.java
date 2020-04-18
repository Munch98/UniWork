package org.example;

public class Produkt {
    private String produktID;
    private int mængde;
    private Produktbeskrivelse produktbeskrivelse;

    public Produkt(String produktID, int mængde, Produktbeskrivelse produktbeskrivelse) {
        this.produktID = produktID;
        this.mængde = mængde;
        this.produktbeskrivelse = produktbeskrivelse;
    }

    public double beregnPris(){
        return 0;
    };

    public String getProduktID() {
        return produktID;
    }

    public void setProduktID(String produktID) {
        this.produktID = produktID;
    }

    public int getMængde() {
        return mængde;
    }

    public void setMængde(int mængde) {
        this.mængde = mængde;
    }
}
