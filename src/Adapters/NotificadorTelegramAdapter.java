package com.example;

public class NotificadorTelegramAdapter implements Notificador {
    private Telegram api;
    private String userId;

    public NotificadorTelegramAdapter(Telegram api, String userId) {
        this.api = api;
        this.userId = userId;
    }

    @Override
    public void enviar(String mensaje) {
        api.sendTelegram(userId, mensaje);
    }
}
