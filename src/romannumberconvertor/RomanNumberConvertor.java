package romannumberconvertor;

import java.util.TreeMap;

public class RomanNumberConvertor {
	static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

    public static void main(String[] args) {

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
    	  int closestKey = treeMap.floorKey(arabicNumber);
    	  if(arabicNumber != closestKey) {
    		  return treeMap.get(closestKey) + arabicToRoman(arabicNumber - closestKey);
    	  }else{
    		  return treeMap.get(arabicNumber);
    	  }
    }
}
