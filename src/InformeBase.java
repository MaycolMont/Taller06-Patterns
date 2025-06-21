package com.example;

public class InformeBase implements InformeVisual {
    private Informe reporte;

    public InformeBase(Informe reporte) {
        this.reporte = reporte;
    }

    @Override
    public void mostrar() {
        reporte.mostrar();
    }
}
