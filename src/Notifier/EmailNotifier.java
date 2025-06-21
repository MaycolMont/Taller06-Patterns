package Notifier;

import Report.Report;

public class EmailNotifier extends Notifier {
    @Override
    public void notify(Report report) {
        // Logic to send a message via Email
        System.out.println("Sending report to Email: " + contactInfo);
    }

}
