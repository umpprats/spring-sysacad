package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EspecialidadTestCase {

    @Test
    public void testEspecialidad() {
        var especialidad = new Especialidad();
        var tipoEspecialidad = new TipoEspecialidad();

        tipoEspecialidad.setNombre("Tipo de Especialidad");
        tipoEspecialidad.setNivel("I");
        especialidad.setTipoEspecialidad(tipoEspecialidad);
        especialidad.setNombre("Ingeniería en Sistemas");
        especialidad.setLetra("IS");
        especialidad.setObservacion("Descripción de la especialidad");
        assertNotNull(especialidad);
        assertEquals("Ingeniería en Sistemas", especialidad.getNombre());
        assertEquals("Descripción de la especialidad", especialidad.getObservacion());
    }
    
}
