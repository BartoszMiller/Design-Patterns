package behavioral.observer;

public class SubscriberSms implements Subscriber {

    private EmailSubscription subscription;
    private String phoneNumber;

    public SubscriberSms(EmailSubscriptionRyanairCheapFlights subscription, String phoneNumber) {
        this.subscription = subscription;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Sending sms \"%s\" to number \"%s\".", message, phoneNumber));
    }

    @Override
    public void resignFromSubscription() {
        subscription.removeSubscriber(this);
    }
}
