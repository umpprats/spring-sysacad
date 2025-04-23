package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CargoTestCase {
    
    @Test
    public void testCargoCreation() {
        
        var cargo = new Cargo();
        cargo.setNombre("Decano");
        cargo.setPuntos(1);
        
        assertNotNull(cargo);
        assertEquals(1, cargo.getPuntos());       
        assertEquals("Decano", cargo.getNombre());
    }
}
