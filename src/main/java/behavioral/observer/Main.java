package behavioral.observer;

public class Main {

    public static void main(String[] args) {

        /**
         *                          OBSERVER
         *  EmailSubscriptionRyanairCheapFlights is an observable class which
         *  sends e-mails and text messages to its subscribers. There are two
         *  types of subscribers (E-mail and Sms). Every subscriber is
         *  an observer and because of that both types of subscribers must implement
         *  the same interface.
         */

        EmailSubscriptionRyanairCheapFlights subscription = new EmailSubscriptionRyanairCheapFlights();

        subscription.addSubscriber(new SubscriberEmail("bill@gmail.com"));
        subscription.setLatestOffer("Releasing new prices for flights in April!");

        subscription.addSubscriber(new SubscriberSms("001312567891"));
        subscription.setLatestOffer("Releasing new prices for flights in May!");
    }
}
