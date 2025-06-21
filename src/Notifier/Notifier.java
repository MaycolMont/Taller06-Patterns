package Notifier;

import Report.Report;

public abstract class Notifier {
    // Singleton pattern to ensure only one instance of Notifier exists
    // This is the base class for all Notifiers, which can be extended for specific implementations
    static Notifier instance;
    protected String contactInfo;

    protected Notifier() {
        if (instance != null) {
            throw new IllegalStateException("Notifier instance already created");
        }
        instance = this;
    }

    public static Notifier getInstance() {
        return instance;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void notify(Report report);
}
