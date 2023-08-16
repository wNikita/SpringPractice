package UsingConstrutor;

public class VoiceSMS implements SMS{
    @Override
    public void sendMessage() {
        System.out.println("I am from VoiceSMS");
    }
}
