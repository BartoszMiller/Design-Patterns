package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EmailSubscriptionRyanairCheapFlights implements EmailSubscription {

    // Subject/observable holds state. Once it changes, observers are updated
    private String latestOffer;

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.sendMessage(latestOffer);
        }
    }

    public void setLatestOffer(String latestOffer) {
        System.out.println("****** New offers has been prepared by Ryanair ******");
        this.latestOffer = latestOffer;
        notifySubscribers();
    }
}
