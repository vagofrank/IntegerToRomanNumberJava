import java.util.TreeMap;

/**
* @Author: Frank Glez
* @Version: 0.0.1
* Last Modification Date: 16/11/2019
* Class to convert an Arabic number between 1 and 3999 to a Roman Number
*/

public class RomanNumber {

    private final int LIMIT = 3999;
    private final TreeMap<Integer, String> ROMAN_NUMBERS = new TreeMap<Integer, String>();

    /**
    * Constructor initialize the possible number options
    */
    public RomanNumber(){
        ROMAN_NUMBERS.put(1, "I");
        ROMAN_NUMBERS.put(4, "IV");
        ROMAN_NUMBERS.put(5, "V");
        ROMAN_NUMBERS.put(9, "IX");
        ROMAN_NUMBERS.put(10, "X");
        ROMAN_NUMBERS.put(40, "XL");
        ROMAN_NUMBERS.put(50, "L");
        ROMAN_NUMBERS.put(90, "XC");
        ROMAN_NUMBERS.put(100, "C");
        ROMAN_NUMBERS.put(400, "CD");
        ROMAN_NUMBERS.put(500, "D");
        ROMAN_NUMBERS.put(900, "CM");
        ROMAN_NUMBERS.put(1000, "M");
    }

    /**
    * Convert an Arabic Number to Roman Number
    * @param number An Integer between 1 and 3999
    * @return An String with the Roman Number
    */
    public String IntegerToRomanNumber(int number) {

        int floorKey =  ROMAN_NUMBERS.floorKey(number);

        if(number < 0 || number > LIMIT)
            return "";
        else
            return number == floorKey ? ROMAN_NUMBERS.get(number) : ROMAN_NUMBERS.get(floorKey) + IntegerToRomanNumber(number - floorKey);

    }

    // Run to test conversion from 1 to 3999 */
    public static void main(String[] argv){
        RomanNumber rm = new RomanNumber();

        for(int i = 1; i <= 3999; i++){
            System.out.println(i + "   -->   " + rm.IntegerToRomanNumber(i));
        }

    }
   
}
