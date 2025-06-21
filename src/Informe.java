package com.example;

public class Informe {
    public String titulo;
    public String contenido;
    public String formato;  // PDF, Excel, Word
    
    
    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Formato: " + formato);
    }
}
