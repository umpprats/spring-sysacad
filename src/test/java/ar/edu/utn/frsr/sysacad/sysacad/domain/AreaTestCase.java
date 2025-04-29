package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AreaTestCase {
    
    @Test
    public void testArea() {
        var area = new Area();
        area.setNombre("Area de Sistemas");
    
        assertNotNull(area);
        assertEquals("Area de Sistemas", area.getNombre());
    }
}
