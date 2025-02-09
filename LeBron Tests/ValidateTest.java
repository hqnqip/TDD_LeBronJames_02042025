import static org.junit.jupiter.api.Assertions.assertTrue;
class ValidateTest {
    @org.junit.jupiter.api.Test
    void validUser() {
        String test1 = ("@hqnqip");
        //String test2 = ("@LPSBananaz");
        assertTrue(test1.matches("@[a-z0-9]{4,}"));
        //assertTrue(test2.matches("@[a-z0-9]{4,}"));
    }

    @org.junit.jupiter.api.Test
    void validThree() {
        String test1 = "Bid";
        assertTrue(test1.matches("[^aeiouy][aeiouy][^aeiouy]"));
        // [c][v][c]
    }

    @org.junit.jupiter.api.Test
    void validFour() {
        String test1 = ("Bean");
        assertTrue(test1.matches("[^aeiouy]ea[^aeiouy]"));
        // [c]ea[c]
    }

    @org.junit.jupiter.api.Test
    void validFive() {
        String test1 = ("Aa");
        assertTrue(test1.matches("@[a-zA-Z]{5}"));
    }
}