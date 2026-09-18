import org.example.Commande;
import org.example.TypeVetement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCommande {
    private Commande commande;

   @BeforeEach
    void setUp(){
        commande = new Commande("John",LocalDate.of(2025,10,10),"vetement de haut avec une manches courtes",TypeVetement.VetementHaut);
   }

   @Test
    void testDeCommande(){
       commande.coutTolat("paulo");
       assertEquals(1500, commande.getVetement().getPrixUnitaire());
   }
}
