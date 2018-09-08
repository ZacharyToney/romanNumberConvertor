import org.junit.*;
import romannumberconvertor.RomanNumberConvertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Keith DeSimini
 */
public class mainJunitTest {


    @Test
    public void testOneRomanFollowedByOneNonRoman() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "VA";
        assertEquals(0, r2a.romanToArabic(string), "Must Return 0");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testTwoRomanFollowedByTwoNonRoman() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "VIAZ";
        assertEquals(0, r2a.romanToArabic(string), "Must Return 0");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void MixOfNonRomanAndRoman() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "VIAZDHWYDHCNSKDF";
        assertEquals(0, r2a.romanToArabic(string), "Must Return 0");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testTwoNonRoman() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "ZL";
        assertEquals(0, r2a.romanToArabic(string), "Must Return o");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testArabic() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "0";
        assertEquals(0, r2a.romanToArabic(string), "Must Return o");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testNegativeArabic() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "-6";
        assertEquals(0, r2a.romanToArabic(string), "Must Return o");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testMultipleNegativeArabic() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "-3726";
        assertEquals(0, r2a.romanToArabic(string), "Must Return o");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testArabicWithNonRoman() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "0Z";
        assertEquals(0, r2a.romanToArabic(string), "Must Return o");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testNonRomanFollowedByArabic() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "Z0";
        assertEquals(0, r2a.romanToArabic(string), "Must Return o");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testMultipleArabic() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "87384";
        assertEquals(0, r2a.romanToArabic(string), "Must Return o");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testMultipleArabicFollowedByMultipleRoman() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "87384XVI";
        assertEquals(0, r2a.romanToArabic(string), "Must Return o");
        System.out.println(r2a.romanToArabic(string));
    }


    @Test
    public void testFor6() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "VI";
        assertEquals(6, r2a.romanToArabic(string), "Must Return 6");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testFor14() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "XIV";
        assertEquals(14, r2a.romanToArabic(string), "Must Return 14");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testFor20() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "XX";
        assertEquals(20, r2a.romanToArabic(string), "Must Return 20");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testFor150() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "CL";
        assertEquals(150, r2a.romanToArabic(string), "Must Return 150");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testFor37273() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCCLXXIII";
        assertEquals(37273, r2a.romanToArabic(string), "Must Return 37273");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testI() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "I";
        assertEquals(1, r2a.romanToArabic(string), "Must Return 1");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testV() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "V";
        assertEquals(5, r2a.romanToArabic(string), "Must Return 5");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testX() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "X";
        assertEquals(10, r2a.romanToArabic(string), "Must Return 10");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testL() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "L";
        assertEquals(50, r2a.romanToArabic(string), "Must Return 50");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testC() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "C";
        assertEquals(100, r2a.romanToArabic(string), "Must Return 100");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testD() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "D";
        assertEquals(500, r2a.romanToArabic(string), "Must Return 500");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testM() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "M";
        assertEquals(1000, r2a.romanToArabic(string), "Must Return 1000");
        System.out.println(r2a.romanToArabic(string));
    }

    @Test
    public void testFor3728() {
        RomanNumberConvertor r2a = new RomanNumberConvertor();
        String string = "MMMDCCXXVIII";
        assertEquals(3728, r2a.romanToArabic(string), "Must Return 3728");
        System.out.println(r2a.romanToArabic(string));
    }


}
