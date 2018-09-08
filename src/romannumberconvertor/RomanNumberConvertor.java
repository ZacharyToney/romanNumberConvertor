package romannumberconvertor;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

import java.util.Scanner;
import java.util.TreeMap;

public class RomanNumberConvertor {
    static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an arabic number: ");
        if (scanner.hasNextInt()) {
            int arabicNumber = scanner.nextInt();
            System.out.println(arabicToRoman(arabicNumber));
        } else {
            System.out.println("Please enter a number");
        }
    }

    /*
     The buildTreeMap() function populates treeMap.
     Each key is an integer with a String value.
     This function includes all letters necessary
     for converting numbers between 1 and 4,999 to
     roman numerals.
     */

    static void buildTreeMap() {
        treeMap.put(1, "I");
        treeMap.put(4, "IV");
        treeMap.put(5, "V");
        treeMap.put(9, "IX");
        treeMap.put(10, "X");
        treeMap.put(40, "XL");
        treeMap.put(50, "L");
        treeMap.put(90, "XC");
        treeMap.put(100, "C");
        treeMap.put(400, "CD");
        treeMap.put(500, "D");
        treeMap.put(900, "CM");
        treeMap.put(1000, "M");
    }

    /*
    The arabicToRoman() function does all of the magic.
    It is a recursive function. Using a tree map allows
    us to use the .floorkey() function to find the first
    possible key smaller than the given arabicNumber. It then
    calls the function again using the difference between the
    original arabicNumber and its closestKey. However, if the given
    arabicNumber matches on of the keys exactly, it will return
    the value paired with it immediately.
    */

    public static String arabicToRoman(int arabicNumber) {
        buildTreeMap();
        if (arabicNumber <= 0 || arabicNumber > 4999) {
            return "Please enter a valid value";
        } else {
            int closestKey = treeMap.floorKey(arabicNumber);
            if (arabicNumber != closestKey) {
                return treeMap.get(closestKey) + arabicToRoman(arabicNumber - closestKey);
            } else {
                return treeMap.get(arabicNumber);
            }
        }
    }
}
