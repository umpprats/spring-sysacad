package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GrupoTestCase {
    
    @Test
    public void testGrupo() {
        var grupo = new Grupo();
        grupo.setNombre("Grupo de Sistemas");
    
        assertNotNull(grupo);
        assertEquals("Grupo de Sistemas", grupo.getNombre());
    }
}
