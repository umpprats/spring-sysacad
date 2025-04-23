package ar.edu.utn.frsr.sysacad.sysacad.domain;

import lombok.Data;

@Data
public class Autoridad {
    private String nombre;
    private Cargo cargo;
    private String telefono;
    private String email;
}
