package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UniversidadTestCase {
    
    @Test
    public void testUniversidad() {
        Universidad universidad = new Universidad();
        universidad.setNombre("Universidad Tecnológica Nacional");
        universidad.setSigla("UTN");
        
        assertEquals("Universidad Tecnológica Nacional", universidad.getNombre());
        assertEquals("UTN", universidad.getSigla());
        
    }
}
