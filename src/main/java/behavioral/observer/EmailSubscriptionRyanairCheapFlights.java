package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EmailSubscriptionRyanairCheapFlights implements EmailSubscription {

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
            subscriber.sendMessage("Latest offer from Ryanair");
        }
    }

    public void newCheapPricesOfferReleased() {
        System.out.println("Releasing new prices for flights!");
        notifySubscribers();
    }
}
