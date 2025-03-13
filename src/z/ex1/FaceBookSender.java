package z.ex1;

public class FaceBookSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("페북 발송: " + message);
    }
}
