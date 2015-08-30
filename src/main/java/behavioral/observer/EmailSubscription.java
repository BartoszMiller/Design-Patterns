package behavioral.observer;

// Subject
public interface EmailSubscription {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();
}
