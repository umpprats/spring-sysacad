package ar.edu.utn.frsr.sysacad.sysacad.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.utn.frsr.sysacad.sysacad.enumerator.TipoDocumento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

@SpringBootTest
public class AlumnoTestCase {
    
    @Test
    public void testAlumno() {
        var alumno = new Alumno();
        alumno.setNombre("Pablo Andres");
        alumno.setApellido("Prats");
        alumno.setNroDocumento("12345678");
        alumno.setTipoDocumento(TipoDocumento.DNI);
        alumno.setFechaNacimiento(LocalDate.parse("1975-01-01"));
        alumno.setSexo("M");
        alumno.setNroLegajo(123456);
        alumno.setFechaIngreso(LocalDate.parse("2023-01-01"));

        assertEquals("Pablo Andres", alumno.getNombre());
        assertEquals("Prats", alumno.getApellido());
        assertEquals("12345678", alumno.getNroDocumento());
        assertEquals(TipoDocumento.DNI, alumno.getTipoDocumento());
        assertEquals(LocalDate.parse("1975-01-01"), alumno.getFechaNacimiento());
        assertEquals("M", alumno.getSexo());
        assertEquals(123456, alumno.getNroLegajo());
        assertEquals(LocalDate.parse("2023-01-01"), alumno.getFechaIngreso());
    }

}
