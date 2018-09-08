package romannumberconvertor;

import java.util.TreeMap;

public class RomanNumberConvertor {
	static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

    public static void main(String[] args) {
       buildTreeMap();
    }
    
    private static void buildTreeMap() {
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
    
    private static String arabicToRoman(int arabicNumber) {
    	  int closestKey = treeMap.floorKey(arabicNumber);
    	  if(arabicNumber != closestKey) {
    		  return treeMap.get(closestKey) + arabicToRoman(arabicNumber - closestKey);
    	  }else{
    		  return treeMap.get(arabicNumber);
    	  }
    }
}
