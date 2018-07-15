package ICT;

public class ConvertingDecimalNumbers {
    static int numberBeforePoint;
    public static void main(String[] args) {

        convertingRepeating(5.2);


    }
    public static int decimalToBinary(int number){
        number = Math.abs(number);
        //so that it works with negative numbers
        StringBuilder reverseResult = new StringBuilder();
        while (number!=0){
            //the remainder is added to reverse stringBuilder
            reverseResult.append(number%2);
            //divide by two in order to go to the next step
            number/=2;
        }
        //reverse our string to get final result
        StringBuilder result = new StringBuilder();
        for (int i = reverseResult.length()-1; i >= 0; i--) {
            result.append(reverseResult.charAt(i));
        }
        return Integer.parseInt(result.toString());
    }

    public static void converting(double number){
        int wholePart = (int)number;
        int wholePartBinary = decimalToBinary(wholePart);

        double decimalPart = number - wholePart;                        //0.125
        StringBuilder decimalPartBinaryStr = new StringBuilder();       //storing decimal part
        int wholePartTemp;                                              //whole part of multiplied decimal part by 2 (1 or 0)
        while (decimalPart!=1){
            wholePartTemp = (int)(decimalPart*2);
            decimalPartBinaryStr.append(wholePartTemp);
            decimalPart = decimalPart*2;
        }

        System.out.println("\nWhole part: "+wholePartBinary);
        System.out.println("Decimal part: "+decimalPartBinaryStr.toString());
    }

    public static void convertingRepeating(double number){
        int wholePart = (int)number;
        int wholePartBinary = decimalToBinary(wholePart);

        int pattern = Integer.parseInt(String.valueOf(number).substring(String.valueOf(number).indexOf(".")+1));
        //taking substring   5.2 -> 2
        int patternToCompare = 0;
        double decimalPart = pattern/10.0; // 0.2
        StringBuilder decimalPartBinaryStr = new StringBuilder();

        while(pattern!=patternToCompare){
            if((int)decimalPart==1) {
                decimalPart = (Integer.parseInt(String.valueOf(decimalPart).substring(2))*2)/10.0;

            }else{
                decimalPart = decimalPart * 2;
            }
            decimalPartBinaryStr.append((int)(decimalPart));      //0.2
            patternToCompare = Integer.parseInt(String.valueOf(decimalPart).substring(String.valueOf(decimalPart).indexOf(".")+1));
        }
        System.out.println(wholePartBinary+"."+decimalPartBinaryStr.toString());
    }
}
