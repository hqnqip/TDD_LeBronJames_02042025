public class Validate
{
    //Username: @_____
    public static boolean validUser(String word)
    {
        return word.matches("@[a-z]{5,}");
    }

    //Acceptable Two-Letter Word
    public static boolean validTwo(String word)
    {
        return word.matches("[a-zA-Z]{2}");
    }

    //Acceptable Three-Letter Word
    public static boolean validThree(String word)
    {
        return word.matches("[a-zA-Z]{3}");
    }

    //Acceptable Four-Letter Word
    public static boolean validFour(String word)
    {
        return word.matches("[a-zA-Z]{4}");
    }
}

/*
+ means "1 or more occurrences."
{3} means "3 occurrences."
{3,} means "3 or more occurrences."
+ can also be written as {1,}.
* can also be written as {0,}.
*/
