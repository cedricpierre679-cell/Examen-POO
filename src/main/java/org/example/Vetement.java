package org.example;

import java.util.List;

public class Vetement {
    private String nom;
    private List<String> taille;
    private int prixUnitaire;
    private List<String> materiel;
    private TypeVetement vetement;

    public Vetement(String nom, List<String> taille, int prixUnitaire, List<String> materiel, TypeVetement vetement) {
        this.nom = nom;
        this.taille = taille;
        this.prixUnitaire = prixUnitaire;
        this.materiel = materiel;
        this.vetement = vetement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getTaille() {
        return taille;
    }

    public void setTaille(List<String> taille) {
        this.taille = taille;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public List<String> getMateriel() {
        return materiel;
    }

    public void setMateriel(List<String> materiel) {
        this.materiel = materiel;
    }

    public TypeVetement getVetement() {
        return vetement;
    }

    public void setVetement(TypeVetement vetement) {
        this.vetement = vetement;
    }


}
