package behavioral.observer;

public interface Subscriber {

    void sendMessage(String message);

    void resignFromSubscription();
}
