package Notifier.ExternalServices;

public class TelegramNotifier {
    public void sendMessage(String message) {
        // Logic to send a message via Telegram
        System.out.println("Sending Telegram message: " + message);
    }

    public void sendFile(File file) {
        // Logic to send a file via Telegram
        System.out.println("Sending Telegram file: " + file.getName());
    }
}
