package com.example;

public class InformeExcelBuilder extends InformeBuilder {
    private Informe informe;

    @Override
    public void definirInforme() {
        Informe informe = new Informe();
        informe.titulo = "Reporte en formato Excel";
    }

    @Override
    public void definirContenido() {
        informe.contenido = "Contenido para Excel";
    }

    @Override
    public void definirFormato() {
        informe.formato = "Excel";
    }
}
