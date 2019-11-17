public class RomanNumberTest {

    // Run to test conversion from 1 to 3999 */
    public static void main(String[] argv){
        RomanNumber rm = new RomanNumber();

        for(int i = 1; i <= 3999; i++){
            System.out.println(i + "   -->   " + rm.IntegerToRomanNumber(i));
        }

    }

}
