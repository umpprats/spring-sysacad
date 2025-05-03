package ar.edu.utn.frsr.sysacad.sysacad.domain;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AutoridadTestCase {
    
    @Test
    public void testAutoridadCreation() {
        
        var autoridad = new Autoridad();
        var cargo = new Cargo();
        cargo.setNombre("Decano");
        cargo.setPuntos(10);
        autoridad.setNombre("Ing. Roberto D. Vilches");
        autoridad.setCargo(cargo);
        autoridad.setTelefono("02604421078");
        autoridad.setEmail("rvilches@frsr.utn.edu.ar");

        assertNotNull(autoridad);
        assertEquals("Ing. Roberto D. Vilches", autoridad.getNombre());
        assertEquals(cargo, autoridad.getCargo());
        assertEquals("02604421078", autoridad.getTelefono());
        assertEquals("rvilches@frsr.utn.edu.ar", autoridad.getEmail());
        
    }
}