import static org.junit.jupiter.api.Assertions.assertTrue;

class LeBronTest
{
    //Testing whether the character has a chance of losing the shot.
    @org.junit.jupiter.api.Test
    void lucky()
    {
        double critRate = 0.1;
        int rate = (int)((critRate * 10));
        int num = (int)(Math.random() * 11);

        if (num <= rate)
        {
            System.out.println("You made it in!");
        }
        else
        {
            System.out.println("Ouch, you did not make it...");
        }
    }

    //Testing the format of print-lines.
    @org.junit.jupiter.api.Test
    void prompt()
    {
        String question = "";
        String pattern = "\nPattern: ";

        question += "Question: Any word.";
        pattern += "[consonant][vowel][consonant]";

        System.out.println(question + pattern);
    }
}