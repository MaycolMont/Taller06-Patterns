package Notifier;

import Notifier.ExternalServices.File;
import Notifier.ExternalServices.WhatsappNotifier;
import Report.Report;

public class WhatsappNotifierAdapter extends Notifier {
    private final WhatsappNotifier whatsappNotifier;

    public WhatsappNotifierAdapter(WhatsappNotifier whatsappNotifier) {
        this.whatsappNotifier = whatsappNotifier;
    }

    @Override
    public void notify(Report report) {
        File file = report.getFile();
        if (file != null) {
            whatsappNotifier.sendFile(file);
        }
    }
}
