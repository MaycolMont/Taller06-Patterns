package com.example;

public class NotificadorWhatsAppAdapter implements Notificador {
    private WhatsApp api;
    private String phoneNumber;

    public NotificadorWhatsAppAdapter(WhatsApp api, String phoneNumber) {
        this.api = api;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void enviar(String mensaje) {
        api.sendWhatsAppMessage(phoneNumber, mensaje);
    }
}
