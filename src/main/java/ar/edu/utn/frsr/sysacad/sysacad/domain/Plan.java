package ar.edu.utn.frsr.sysacad.sysacad.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Plan {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String observacion;
}
