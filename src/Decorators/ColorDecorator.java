package com.example;

public class ColorDecorator extends InformeDecorator {
    private String color;

    public ColorDecorator(InformeVisual decorado, String color) {
        super(decorado);
        this.color = color;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Color aplicado: " + color);
    }
}
