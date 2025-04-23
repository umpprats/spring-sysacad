package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoriaCargoTestCase {
    
    @Test
    public void testCategoriaCargo() {
        var categoriaCargo = new CategoriaCargo();
        categoriaCargo.setNombre("Administrativo");
        assertNotNull(categoriaCargo);
        assertEquals("Administrativo", categoriaCargo.getNombre());
    }
}
