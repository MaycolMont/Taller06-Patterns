package com.example;

public class InformeWordBuilder extends InformeBuilder  {
    private Informe informe;

    @Override
    public void definirInforme() {
        Informe informe = new Informe();
        informe.titulo = "Reporte en formato Word";
    }

    @Override
    public void definirContenido() {
        informe.contenido = "Contenido para Word";
    }

    @Override
    public void definirFormato() {
        informe.formato = "Word";
    }
}
