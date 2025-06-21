package com.example;

public abstract class InformeDecorator implements InformeVisual {
    protected InformeVisual decorado;

    public InformeDecorator(InformeVisual decorado) {
        this.decorado = decorado;
    }

    @Override
    public void mostrar() {
        decorado.mostrar();
    }
}
