package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FacultadTestCase {
    
    @Test
    public void testFacultad() {
        Facultad facultad = new Facultad();
        
        facultad.setNombre("Facultad Regional San Rafael");
        facultad.setAbreviatura("FRSR");
        facultad.setDirectorio("Facultad de Ingeniería");
        facultad.setSigla("FRSR");
        facultad.setCodigoPostal("5600");
        facultad.setCiudad("San Rafael");
        facultad.setDomicilio("Av. Gral. J. J. Urquiza 314");
        facultad.setTelefono("02604421078");
        facultad.setContacto("Ing. Roberto D. Vilches");
        facultad.setEmail("rvilches@frsr.utn.edu.ar");
        
        assertNotNull(facultad);
        assertEquals("Facultad Regional San Rafael", facultad.getNombre());
        assertEquals("FRSR", facultad.getAbreviatura());
        assertEquals("Facultad de Ingeniería", facultad.getDirectorio());
        assertEquals("FRSR", facultad.getSigla());
        assertEquals("5600", facultad.getCodigoPostal());
        assertEquals("San Rafael", facultad.getCiudad());
        assertEquals("Av. Gral. J. J. Urquiza 314", facultad.getDomicilio());
        assertEquals("02604421078", facultad.getTelefono());
        assertEquals("Ing. Roberto D. Vilches", facultad.getContacto());
        
    }
}
