package com.example;

public class InformeDirector {
     private InformeBuilder builder;

    public InformeDirector(InformeBuilder builder) {
        this.builder = builder;
    }

    public void construirInforme() {
        builder.definirInforme();
        builder.definirContenido();
        builder.definirFormato();
    }

    public Informe getInforme() {
        return builder.getInforme();
    }

}
