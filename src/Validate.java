public class Validate
{
    //Username: @_____
    public static boolean validUser(String word)
    {
        return word.matches("@[a-z0-9]{4,}");
    }

    //Acceptable Three-Letter Word
    public static boolean validThree(String word)
    {
        return word.matches("[^aeiouy][aeiouy][^aeiouy]");
    }

    //Acceptable Four-Letter Word
    public static boolean validFour(String word)
    {
        return word.matches("[^aeiouy]ea[^aeiouy]");
    }

    //Acceptable Five-Letter Word
    public static boolean validFive(String word)
    {
        return word.matches("[a-zA-Z]{5}");
    }
}

/*
+ means "1 or more occurrences."
{3} means "3 occurrences."
{3,} means "3 or more occurrences."
+ can also be written as {1,}.
* can also be written as {0,}.
*/
