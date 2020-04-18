package org.example;

import java.util.ArrayList;

public class Ordre {
    private String leveringsAdresse;
    private double forsendelsespris;
    private double afgifter;
    private double medlemsrabat;
    private double totalpris;
    private int pointOptjent;
    private String status;
    private ArrayList<Produkt> produkter;

    public Ordre(String leveringsAdresse, double forsendelsespris, double afgifter, double medlemsrabat,
                 double totalpris, int pointOptjent, String status, ArrayList<Produkt> produkter) {
        this.leveringsAdresse = leveringsAdresse;
        this.forsendelsespris = forsendelsespris;
        this.afgifter = afgifter;
        this.medlemsrabat = medlemsrabat;
        this.totalpris = totalpris;
        this.pointOptjent = pointOptjent;
        this.status = status;
        this.produkter = produkter;
    }

    public int getPointOptjent() {
        return pointOptjent;
    }
}
