package Project;

public class CreditCard {
    private long numberOfCreditCard;
    private int cvvORcsc;
    private Time dateOfExpire;

    CreditCard(long numberOfCreditCard, int cvvORcsc, Time dateOfExpire){
        if(String.valueOf(numberOfCreditCard).length()==16)
            this.numberOfCreditCard = numberOfCreditCard;
        else {
            System.out.println("Credit card number must be 16 digits long.");
            this.numberOfCreditCard = 0;
        }
        if(String.valueOf(cvvORcsc).length()==3)
            this.cvvORcsc = cvvORcsc;
        else{
            System.out.println("CVV must be 3 characters long");
            this.cvvORcsc = cvvORcsc;
        }
        this.dateOfExpire = new Time(dateOfExpire.getMonth(), dateOfExpire.getYear());
    }
}
