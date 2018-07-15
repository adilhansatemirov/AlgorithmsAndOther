package Week12.Message;

public class Email extends Message{
    protected String sender;
    private String receiver;
    private String subject;

    public Email(String text, String sender, String receiver,String subject){
        super(text);                    //sets text as like as in parent class
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }
    public String toString(){
        return "Sender: " + this.sender + "\nReceiver: " + this.receiver + "\nSubject: " + this.subject+"\nText: "+this.text;
        //returns everything in sorted way
    }
}
