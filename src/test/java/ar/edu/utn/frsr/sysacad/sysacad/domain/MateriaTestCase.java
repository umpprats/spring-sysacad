package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MateriaTestCase {
    
    @Test
    public void testMateria() {
        var materia = new Materia();
        materia.setNombre("Programacion I");
        materia.setCodigo("101");
        materia.setObservacion("Obligatoria");
        
        assertNotNull(materia);
        assertEquals("Programacion I", materia.getNombre());
        assertEquals("101", materia.getCodigo());
        assertEquals("Obligatoria", materia.getObservacion());
    }
}
