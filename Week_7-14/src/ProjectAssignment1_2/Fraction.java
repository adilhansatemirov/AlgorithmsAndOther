package ProjectAssignment1_2;
/*Student: Adilkhan Satemirov
* Teacher: Abdyldayev Satbek
* Date: 21.10.2017
* Description: Fraction class */

public class Fraction {
    private int num;
    private int den;

    public Fraction(){
        this.num = 0;
        this.den = 1;
    }

    public Fraction(int n, int d) {
        this.num = n;
        this.den = d;
    }
    public Fraction(double d){                                          //for example 1.225
        String s = String.valueOf(Math.abs(d));                         //"1.225"
        int digits_after_point = s.length() - s.indexOf('.') - 1;       //5-1-1=3
        int denomin = 1;
        for (int i = 1; i <=digits_after_point; i++){
            denomin*=10;                                                //1*1000=1000(my denominator)
        }
        this.den = denomin;
        for(int i = 1; i<=digits_after_point;i++){
            d*=10;                                                      //1.225*1000 = 1225.0
        }
        this.num = (int)d;
    }
    public void simplify(){           //например 5/10
        for (int i = Math.abs(Math.min(num,den)); i>=2; i--){  //минимальное из 5 и 10
            if(Math.abs(num)%i==0 && Math.abs(den)%i==0){               //если 5%5==0  и 10%5==0 то...
                this.num = num/i;                   //num = 5/5 ==1
                this.den = den/i;                   //den = 10/5==2    5/10=1/2
            }
        }
    }
    public void add(Fraction other_one){
        this.num = num*other_one.den+other_one.num*den;
        this.den = den*other_one.den;
        simplify();
    }
    public void subtract(Fraction other_one){
        this.num = num*other_one.den-other_one.num*den;
        this.den = den*other_one.den;
        simplify();
    }
    public void multiply(Fraction other_one){
        this.num = num*other_one.num;
        this.den = den*other_one.den;
        simplify();
    }
    public void divide(Fraction other_one){
        this.num = num*other_one.den;
        this.den = den*other_one.num;
        simplify();
    }

    public String toString(){
        if(num==den){
         return "Fraction equals: 1";
        }else if(den==1){
            return "Your fraction equals: " + num;
        }else if(den<0 && num>0){
            return "Your fraction is: -"+num+"/"+Math.abs(den);
        }else if(den<0 && num<0){
            return "Your fraction is: "+Math.abs(num)+"/"+Math.abs(den);
        }else if(num==0){
            return "Your fraction equals: 0";
        }else if(den==0){
            return "Can't divide by zero";
        }
        return "Your fraction is: " + num + "/" + den;
    }
    public boolean equals(Fraction other_one){
        return ((double)num/(double)den==(double)other_one.num/(double)other_one.den);
    }
    public boolean greater_than(Fraction other_one){
        return ((double)num/(double)den>(double)other_one.num/(double)other_one.den);
    }
    public boolean less_than(Fraction other_one){
        return ((double)num/(double)den<(double)other_one.num/(double)other_one.den);
    }
}
