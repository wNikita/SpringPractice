package UsingConstrutor;

public class Communication {
    public SMS sms;

    public Communication(SMS sms)
    {
        super();
        this.sms=sms;
    }
    public  void message()
    {
        sms.sendMessage();
    }
}
