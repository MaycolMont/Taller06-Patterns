package com.example;

public class InformePDFBuilder extends InformeBuilder {

    @Override
    public void definirInforme() {
        informe = new Informe();
        informe.titulo = "Reporte en formato PDF";
    }

    @Override
    public void definirContenido() {
        informe.contenido = "Contenido para PDF";
    }

    @Override
    public void definirFormato() {
        informe.formato = "PDF";
    }
}
