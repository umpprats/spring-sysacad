package ar.edu.utn.frsr.sysacad.sysacad.domain;

import lombok.Data;

@Data
public class Especialidad {
    private String nombre;
    private String letra;
    private String observacion;
    private TipoEspecialidad tipoEspecialidad;
}
