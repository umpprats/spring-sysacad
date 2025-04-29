package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DepartamentoTestCase {
    
    @Test
    public void testDepartamento() {
        Departamento departamento = new Departamento();
        departamento.setNombre("Departamento de Sistemas");
       
        assertNotNull(departamento);
        assertEquals("Departamento de Sistemas", departamento.getNombre());
    }
}
