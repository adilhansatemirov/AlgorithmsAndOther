package Project;

public class Time {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    Time(){}

    Time(int month, int year){
        if(month>=1 && month<=12)
            this.month = month;
        else {
            System.out.println("Invalid input for month");
            this.month = 0;
        }
        if(year>=2018 && year<=2300)
            this.year = year;
        else {
            System.out.println("Invalid input for year");
            this.year = 0;
        }
    }

    Time(int day, int month, int year){
        if(day>=1 && day<=31)
            this.day = day;
        else {
            System.out.println("Invalid input for day");
            this.day = 0;
        }
        if(month>=1 && month<=12)
            this.month = month;
        else {
            System.out.println("Invalid input for month");
            this.month = 0;
        }
        if(year>=2018 && year<=2300)
            this.year = year;
        else {
            System.out.println("Invalid input for year");
            this.year = 0;
        }
    }
    Time(int day, int month, int year, int hour, int minute){
        if(day>=1 && day<=31)
            this.day = day;
        else {
            System.out.println("Invalid input for day");
            this.day = 0;
        }
        if(month>=1 && month<=12)
            this.month = month;
        else {
            System.out.println("Invalid input for month");
            this.month = 0;
        }
        if(year>=2018 && year<=2300)
            this.year = year;
        else {
            System.out.println("Invalid input for year");
            this.year = 0;
        }
        if(hour>=0 && hour<=23)
            this.hour = hour;
        else {
            System.out.println("Invalid input for hour");
            this.hour = -1;
        }
        if(minute>=0 && minute<=59)
            this.minute = minute;
        else {
            System.out.println("Invalid input for minute");
            this.minute = -1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
