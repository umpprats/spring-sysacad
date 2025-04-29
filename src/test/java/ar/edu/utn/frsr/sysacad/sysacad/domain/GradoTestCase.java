package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GradoTestCase {
    
    @Test
    public void testGrado() {
        var grado = new Grado();
        grado.setNombre("Grado en Sistemas");
        
        assertEquals("Grado en Sistemas", grado.getNombre());
    }
}
