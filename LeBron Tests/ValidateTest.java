import static org.junit.jupiter.api.Assertions.assertTrue;
class ValidateTest
{
    @org.junit.jupiter.api.Test
    void validUser() {
        String test1 = ("@hqnqip");
        //String test2 = ("@LPSBananaz");
        assertTrue(test1.matches("@[a-z0-9]{4,}"));
        //assertTrue(test2.matches("@[a-z0-9]{4,}"));
    }

    @org.junit.jupiter.api.Test
    void validThree() {
        String test1 = "bid";
        assertTrue(test1.matches("[^aeiouy][aeiouy][^aeiouy]"));
        // [c][v][c]
    }

    @org.junit.jupiter.api.Test
    void validFour() {
        String test1 = ("hoop");
        assertTrue(test1.matches("[dhs][hou][no][kpt]"));
        // [c]ea[c]
    }

    @org.junit.jupiter.api.Test
    void validFive() {
        String test1 = ("field");
        assertTrue(test1.matches("[cf][oi][ue][rl][td]"));
    }

    @org.junit.jupiter.api.Test
    void validSix() {
        String test1 = ("lebron");
        assertTrue(test1.matches("[jbl][ore][ryb][dar][ano][nt]"));
    }

    @org.junit.jupiter.api.Test
    void validSeven() {
        String test1 = ("1996");
        assertTrue(test1.matches("[12][90][92][61]"));
    }
}