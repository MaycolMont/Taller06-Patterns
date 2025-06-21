package Notifier;

public class WhatsappNotifier {
    public void sendMessage(String message) {
        // Logic to send a message via WhatsApp
        System.out.println("Sending WhatsApp message: " + message);
    }

    public void sendFile(File file) {
        // Logic to send a file via WhatsApp
        System.out.println("Sending WhatsApp file: " + file.getName());
    }
}
