package com.example.quentin.cryptowallet;

import android.view.View;

import java.io.Serializable;

public class Monnaie implements Serializable {

    private String nom;
    private int logoCoin;
    private int logoValeur;
    private String soldeEnDollar;
    private String valeurCoin;
    private String soldeEnCoin;


    public Monnaie(String nom, int logoCoin, int logoValeur, String soldeEnDollar, String valeurCoin, String soldeEnCoin) {
        this.nom = nom;
        this.logoCoin = logoCoin;
        this.logoValeur = logoValeur;
        this.soldeEnDollar = soldeEnDollar;
        this.valeurCoin = valeurCoin;
        this.soldeEnCoin = soldeEnCoin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getlogocoin() {
        return logoCoin;
    }

    public void setlogocoin(int logocoin) {
        this.logoCoin = logocoin;
    }

    public String getSoldeEnDollar() {
        return soldeEnDollar;
    }

    public void setSoldeEnDollar(String soldeEnDollar) {
        this.soldeEnDollar = soldeEnDollar;
    }

    public String getValeurCoin() {
        return valeurCoin;
    }

    public void setValeurCoin(String valeurCoin) {
        this.valeurCoin = valeurCoin;
    }

    public String getSoldeEnCoin() {
        return soldeEnCoin;
    }

    public void setSoldeEnCoin(String soldeEnCoin) {
        this.soldeEnCoin = soldeEnCoin;
    }
    public int getLogoValeur() {
        return logoValeur;
    }

    public void setLogoValeur(int logoValeur) {
        this.logoValeur = logoValeur;
    }

}
