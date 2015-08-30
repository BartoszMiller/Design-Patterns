package behavioral.observer;

public class Main {

    public static void main(String[] args) {

        /**
         *                          OBSERVER
         *  EmailSubscriptionRyanairCheapFlights is an observable class which
         *  sends e-mails and text messages to its subscribers. There are two
         *  types of subscribers (Regular and Premium). Every subscriber is
         *  an observer and because of that both types of subscribers must implement
         *  the same interface.
         */

        EmailSubscriptionRyanairCheapFlights subscription = new EmailSubscriptionRyanairCheapFlights();

        Subscriber subscriberRegular = new SubscriberEmail(subscription, "bill@gmail.com");
        Subscriber subscriberPremium = new SubscriberSms(subscription,  "001312567891");

        subscription.addSubscriber(subscriberRegular);
        subscription.addSubscriber(subscriberPremium);
        subscription.newCheapPricesOfferReleased();

        subscriberRegular.resignFromSubscription();
        subscription.newCheapPricesOfferReleased();
    }
}
