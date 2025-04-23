package ar.edu.utn.frsr.sysacad.sysacad.domain;

import java.time.LocalDate;

import ar.edu.utn.frsr.sysacad.sysacad.enumerator.TipoDocumento;
import lombok.Data;

@Data
public class Alumno {
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private TipoDocumento tipoDocumento;
    private LocalDate fechaNacimiento;
    private String sexo;
    private Integer nroLegajo;
    private LocalDate fechaIngreso;
}
