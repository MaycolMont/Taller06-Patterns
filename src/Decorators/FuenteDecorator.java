package com.example;

public class FuenteDecorator extends InformeDecorator {
    private String fuente;

    public FuenteDecorator(InformeVisual decorado, String fuente) {
        super(decorado);
        this.fuente = fuente;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Fuente aplicada: " + fuente);
    }
}
