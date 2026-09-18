package org.example;

import java.time.LocalDate;
import java.util.List;

public class Commande {
    private Client client;
    private LocalDate dateCommande;
    private String description;
    private TypeVetement typeVetement;
    private Vetement vetement;

    public Commande(Client client, LocalDate dateCommande, String description, TypeVetement typeVetement, Vetement vetement) {
        this.client = client;
        this.dateCommande = dateCommande;
        this.description = description;
        this.typeVetement = typeVetement;
        this.vetement = vetement;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeVetement getTypeVetement() {
        return typeVetement;
    }

    public void setTypeVetement(TypeVetement typeVetement) {
        this.typeVetement = typeVetement;
    }

    public Vetement getVetement() {
        return vetement;
    }

    public void setVetement(Vetement vetement) {
        this.vetement = vetement;
    }

    public double coutTolat(List<Vetement> vetement) {
        return vetement.stream()
                .mapToDouble(Vetement::getPrixUnitaire)
                .average()
                .orElse(0);
    }
}
