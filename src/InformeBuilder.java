package com.example;

public abstract class InformeBuilder {
    protected Informe informe;

    public Informe getInforme() {
        return informe;
    }

    public abstract void definirInforme();
    public abstract void definirContenido();
    public abstract void definirFormato();

}
