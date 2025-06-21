package com.example;

public class Main {
    public static void main(String[] args) {

        //Ejemplo de creación de informe PDF
        InformeBuilder pdfBuilder = new InformePDFBuilder();
        InformeDirector director = new InformeDirector(pdfBuilder);

        director.construirInforme();
        Informe pdf = director.getInforme();

        
        InformeVisual informe = new InformeBase(pdf);
        informe.mostrar();

        System.out.println("");
        InformeVisual informe_modificado = new FuenteDecorator(informe, "Arial");
        informe_modificado.mostrar();

    }
}
