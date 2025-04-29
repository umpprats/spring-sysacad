package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TipoDedicacionTestCase {
    
    @Test
    public void testTipoDedicacion() {
        TipoDedicacion tipoDedicacion = new TipoDedicacion();

        tipoDedicacion.setNombre("Dedicación Simple");
        tipoDedicacion.setObservacion("Dedicación Simple");
        
        assertNotNull(tipoDedicacion);
        assertEquals("Dedicación Simple", tipoDedicacion.getNombre());
        assertEquals("Dedicación Simple", tipoDedicacion.getObservacion());
       
    }    
}