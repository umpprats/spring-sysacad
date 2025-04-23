package ar.edu.utn.frsr.sysacad.sysacad.enumerator;

public enum TipoDocumento {
    
    DNI("DNI"),
    LC("LC"),
    LE("LE"),
    PASAPORTE("PASAPORTE"),
    CARNET_DE_EXTRANJERIA("CARNET DE EXTRANJERIA"),
    OTRO("OTRO");

    private String tipo;

    TipoDocumento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
