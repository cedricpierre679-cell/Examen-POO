import org.example.TypeVetement;
import org.example.Vetement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVetement {
    private Vetement vetement;

    @BeforeEach
    void setVetement(){
        vetement = new Vetement("paulo", Collections.singletonList("XL"),1500, Collections.singletonList("coton"), TypeVetement.VetementHaut);
    }

    @Test
    void VetementTest(){
        vetement.setPrixUnitaire(1500);
        assertEquals(1500,vetement.getPrixUnitaire());
    }
}
