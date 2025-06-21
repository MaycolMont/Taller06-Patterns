package com.example;

public class NotificadorDefault implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por Email: " + mensaje);
    }
}

