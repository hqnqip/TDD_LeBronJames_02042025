import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;


class ValidateTest
{
    @org.junit.jupiter.api.Test
    void validUser() {
        String test1 = ("@hqnqip");
        assertTrue(test1.matches("@[a-z0-9]{4,}"));
        //assertTrue(test2.matches("@[a-z0-9]{4,}"));
    }


    @org.junit.jupiter.api.Test
    void validUser2() {
        String test2 = ("@lpsbananas");
        assertTrue(test2.matches("@[a-z0-9]{4,}"));
        //assertTrue(test2.matches("@[a-z0-9]{4,}"));
    }


    @org.junit.jupiter.api.Test
    void validThree() {
        String test1 = "bet";
        assertTrue(test1.matches("[^aeiouy][aeiouy][^aeiouy]"));
        // [c][v][c]
    }


    @org.junit.jupiter.api.Test
    void validThree2() {
        String test2 = "Hop";
        assertTrue(test2.matches("[^aeiouy][aeiouy][^aeiouy]"));
        // [c][v][c]
    }


    @org.junit.jupiter.api.Test
    void validFour() {
        String test1 = ("hoop");
        assertTrue(test1.matches("[dhs][hou][no][kpt]"));
        // [c]ea[c]
    }


    @org.junit.jupiter.api.Test
    void validFour2() {
        String test2 = ("dhnk");
        assertTrue(test2.matches("[dhs][hou][no][kpt]"));
        // [c]ea[c]
    }


    @org.junit.jupiter.api.Test
    void validFive() {
        String test1 = ("field");
        assertTrue(test1.matches("[cf][oi][ue][rl][td]"));
    }


    @org.junit.jupiter.api.Test
    void validFive2() {
        String test2 = ("courd");
        assertTrue(test2.matches("[cf][oi][ue][rl][td]"));
    }


    @org.junit.jupiter.api.Test
    void validSix() {
        String test1 = ("lebron");
        assertTrue(test1.matches("[jbl][ore][ryb][dar][ano][nt]"));
    }


    @org.junit.jupiter.api.Test
    void validSix2() {
        String test2 = ("jordan");
        assertTrue(test2.matches("[jbl][ore][ryb][dar][ano][nt]"));
    }


    @org.junit.jupiter.api.Test
    void validSeven() {
        String test1 = ("1996");
        assertTrue(test1.matches("[12][90][92][61]"));
    }


    @org.junit.jupiter.api.Test
    void validSeven2() {
        String test1 = ("2926");
        assertTrue(test1.matches("[12][90][92][61]"));
    }


    @org.junit.jupiter.api.Test
    void validEight() {
        String test1 = ("9519090909");
        assertTrue(test1.matches("9[1-5][0-9-]{7,}"));
    }


    @org.junit.jupiter.api.Test
    void validEight2() {
        String test2 = ("91087655323645277");
        assertTrue(test2.matches("9[1-5][0-9]{7,}"));
    }


    @org.junit.jupiter.api.Test
    void validEight3() {
        String test3 = ("951-090-9099");
        assertTrue(test3.matches("9[1-5][0-9-]{7,}"));
    }


    @org.junit.jupiter.api.Test
    void validNine() {
        String test1 = ("01/01/2001");
        assertTrue(test1.matches("[0-1][1-9]/[0-3][1-9]/20[0-2][1-9]"));
    }


    @org.junit.jupiter.api.Test
    void validNine2() {
        String test2 = ("12/06/2006");
        assertTrue(test2.matches("[0-1][1-9]/[0-3][1-9]/20[0-2][1-9]"));
    }


    @org.junit.jupiter.api.Test
    void validNine3() {
        String test3 = ("02/10/2025");
        assertTrue(test3.matches("[0-1][1-9]/[0-3][0-9]/20[0-2][0-9]"));
    }


    @org.junit.jupiter.api.Test
    void validTen() {
        String test1 = ("2006");
        assertTrue(test1.matches("^(0|[1-9][0-9]*)$"));
    }
    @org.junit.jupiter.api.Test
    void validTen2() {
        String test2 = ("0");
        assertTrue(test2.matches("^(0|[1-9][0-9]*)$"));
    }
}