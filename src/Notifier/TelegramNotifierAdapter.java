package Notifier;

import Report.Report;

public class TelegramNotifierAdapter extends Notifier {
    private final TelegramNotifier telegramNotifier;

    public TelegramNotifierAdapter(TelegramNotifier telegramNotifier) {
        this.telegramNotifier = telegramNotifier;
    }

    @Override
    public void notify(Report report) {
        File file = report.getFile();
        if (file != null) {
            telegramNotifier.sendFile(file);
        }
    }

}
