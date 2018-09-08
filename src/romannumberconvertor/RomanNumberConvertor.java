package romannumberconvertor;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class RomanNumberConvertor {
    private boolean flag = true;
    // This function returns value of a Roman symbol
    private int valueOfRomanNumeral(char x)
    {

        if (x == 'A' || x == 'B' || x == 'E' || x == 'F' || x == 'G' || x == 'H' || x == 'J' || x == 'K' || x == 'N' || x == 'O' || x == 'P' || x == 'Q' || x == 'R' || x == 'S' || x == 'T' || x == 'U' || x == 'W' || x == 'Y' || x == 'Z' || x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' || x == '7' || x == '8' || x == '9') {
            flag = false;
            return 0;
        }
        if (x == 'I')
            return 1;
        if (x == 'V')
            return 5;
        if (x == 'X')
            return 10;
        if (x == 'L')
            return 50;
        if (x == 'C')
            return 100;
        if (x == 'D')
            return 500;
        if (x == 'M')
            return 1000;
        else {

            return 0;
        }
    }
    
    // Finds the value of the roman numeral string
    public int romanToArabic(String str)
    {

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int char1 = valueOfRomanNumeral(str.charAt(i));
            if (flag) {
                if (i + 1 < str.length()) {
                    int char2 = valueOfRomanNumeral(str.charAt(i + 1));
                    if (char1 >= char2) {
                        result = result + char1;
                    } else {
                        result = result + char2 - char1;
                        i++;
                    }
                } else {
                    result = result + char1;
                    i++;
                }
            }
            else {
                result = 0;
            }
        }
        return result;
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {


            System.out.println("Please enter a roman numeral: ");

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));

            String str = reader.readLine();

            System.out.println(str);

            RomanNumberConvertor r2a = new RomanNumberConvertor();

            if (r2a.romanToArabic(str) != 0) {
                System.out.println("Integer form of Roman Numeral" +
                        " is " + r2a.romanToArabic(str));
            } else {
                System.out.println("Not a valid input.");
            }

    }
    
}
