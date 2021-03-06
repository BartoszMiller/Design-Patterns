package behavioral.observer;

public class SubscriberEmail implements Subscriber {

    private String email;

    public SubscriberEmail(String email){
        this.email = email;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Sending email \"%s\" to e-mail \"%s\".", message, email));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        SubscriberEmail that = (SubscriberEmail) o;

        return !(email != null ? !email.equals(that.email) : that.email != null);

    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}
