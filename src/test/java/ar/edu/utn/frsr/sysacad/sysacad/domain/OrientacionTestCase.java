package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrientacionTestCase {
    
    @Test
    public void testOrientacion() {
        var orientacion = new Orientacion();
        orientacion.setNombre("Orientacion a Objetos");
        
        assertEquals("Orientacion a Objetos", orientacion.getNombre());
    }
}
