package romannumberconvertor;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class RomanNumberConvertor {
    
    // This function returns value of a Roman symbol
    public static int valueOfRomanNumeral(char x)
    {
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
        return -1;
    }
    
    // Finds the value of the roman numeral string
    public static int romanToArabic(String str)
    {   
        int result = 0;
        for (int i=0; i<str.length(); i++)
        {
            int char1 = valueOfRomanNumeral(str.charAt(i));
            if (i+1 <str.length())
            {
                int char2 = valueOfRomanNumeral(str.charAt(i+1));
                if (char1 >= char2)
                {
                    result = result + char1;
                }
                else
                {
                    result = result + char2 - char1;
                    i++; 
                }
            }
            else
            {
                result = result + char1;
                i++;
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
 
        System.out.println("Integer form of Roman Numeral" +
                           " is " + r2a.romanToArabic(str));
    }
    
}
