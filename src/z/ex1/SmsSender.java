package z.ex1;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS발송: " + message);
    }
}
