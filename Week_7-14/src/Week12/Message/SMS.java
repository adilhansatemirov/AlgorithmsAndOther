package Week12.Message;

public class SMS extends Message{
    protected String recipientContactNo;
    SMS(String text, String number){
        super(text);                        //sets the text as like as in the parent class Message
        this.recipientContactNo = number;   //sets the number
    }
    public void setRecipientContactNo(String number){
        this.recipientContactNo = number;
    }
    public String getRecipientContactNo(){
        return this.recipientContactNo;
    }

    public String toString(){
        return "Recipient: "+this.recipientContactNo+"\nMessage: "+this.text;      //returns it in sorted way
    }
}
