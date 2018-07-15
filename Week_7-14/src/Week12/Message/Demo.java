package Week12.Message;

public class Demo {
    public static void main(String[] args) {
        Message myMess = new Message("This is a text message.\n");
        System.out.println(myMess.toString());

        SMS mySMS = new SMS("Text of the SMS","8(705)420-78-61");
//        mySMS.setText("Overpowers the constructor.");
        System.out.println(mySMS.toString());
        System.out.println(mySMS.getRecipientContactNo());

        Email myEmail = new Email("I think that should work","teacher@gmai.com","adilkhan@.gmail.com","Quiz results");
        System.out.println("\n"+myEmail.toString());


    }
}
