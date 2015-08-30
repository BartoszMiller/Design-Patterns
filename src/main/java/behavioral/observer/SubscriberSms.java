package behavioral.observer;

public class SubscriberSms implements Subscriber {

    private String phoneNumber;

    public SubscriberSms(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Sending sms \"%s\" to number \"%s\".", message, phoneNumber));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        SubscriberSms that = (SubscriberSms) o;

        return !(phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null);

    }

    @Override
    public int hashCode() {
        return phoneNumber != null ? phoneNumber.hashCode() : 0;
    }
}
