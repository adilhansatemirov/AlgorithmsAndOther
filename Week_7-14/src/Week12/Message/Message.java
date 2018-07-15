package Week12.Message;

public class Message {
    protected String text;

    public Message(String text){            //constructor that sets the text
        this.text = text;
    }
    public void setText(String text1){      //overpowers the constructor
        this.text = text1;
    }
    public String toString(){               // toString returns the text
        return "Text: "+this.text;
    }
}
