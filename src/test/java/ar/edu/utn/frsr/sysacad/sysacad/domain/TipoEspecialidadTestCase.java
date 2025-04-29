package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TipoEspecialidadTestCase {
    
    @Test
    public void testTipoEspecialidad() {
        var tipoEspecialidad = new TipoEspecialidad();
        tipoEspecialidad.setNombre("Tipo de Especialidad");
        tipoEspecialidad.setNivel("I");
        
        assertNotNull(tipoEspecialidad);
        assertEquals("Tipo de Especialidad", tipoEspecialidad.getNombre());
        assertEquals("I", tipoEspecialidad.getNivel());
    }
}
