package Week8;
public class Temperature {
    private double temperature;
    private char scale_in;

    public Temperature(double temperature, char scale_in){
        this.temperature = temperature;
        this.scale_in = scale_in;
    }
    public Temperature(double temperature){
        this.temperature = temperature;
        scale_in = 'C';
    }
    public Temperature(char scale_in){
        this.scale_in = scale_in;
        temperature = 0;
    }
    public Temperature(){
        scale_in = 'C';
        temperature = 0;
    }


    public double cels() {
        if(scale_in=='C'){
            return temperature;
        }else{
            return 5*(temperature-32)/9.0;
        }
    }
    public double far(){
        if(scale_in == 'F'){
            return temperature;
        }else{
            return 9*(temperature/5.0)+32;
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setScale_in(char scale_in){
        this.scale_in = scale_in;
    }
    public void set_all(double temperature, char scale_in){
        this.scale_in = scale_in;
        this.temperature = temperature;
    }
    public String toString(){
        return "Temperature is " + temperature + " " + scale_in + ".";
    }
}
