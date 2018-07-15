package Project;

import Project.Rooms.Room;

public class Guest {
    private String name;
    private String surname;
    private int id;
    private Time timeOfArrival;
    private boolean needsTransfer;
    private int nightsToStay;
    private Room room;
    private CreditCard creditCard;
    private String preferences;

    Guest(String name, String surname, int id,
          int monthOfArrival, int dayOfArrival, int hourOfArrival, int minuteOfArrival,
          String needsTransfer,
          int nightsToStay,
          int numberOfPersons, String type,
          int numberOfCreditCard, int cvvORcsc, int monthOfExpire, int dayOfExpire,
          String preferences){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.timeOfArrival.setMonth(monthOfArrival);
        this.timeOfArrival.setDay(dayOfArrival);
        this.timeOfArrival.setHour(hourOfArrival);
        this.timeOfArrival.setMinute(minuteOfArrival);
        this.needsTransfer = needsTransfer.equals("Yes");
        this.nightsToStay = nightsToStay;

    }
}
