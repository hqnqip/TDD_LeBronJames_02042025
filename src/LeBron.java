import java.util.concurrent.TimeUnit;

public class LeBron
{
    //Variables
    protected String username;
    protected double critRate;
    protected int position;
    protected int score;

    //Default Constructor
    public LeBron ()
    {
        username = "@lebronjames";
        critRate = 0.60;
        position = 4;
        score = 0;
    }

    //Custom Constructor
    public LeBron (String username)
    {
        this.username = username;
        critRate = 0.30;
        position = 3;
        score = 0;
    }

    //Method
    //Assigns a different word prompt based on user's position.
    public void shoot(String word) throws InterruptedException {
        boolean isCorrect = false;
        if (position == 3)
            isCorrect = Validate.validThree(word);
        else if (position == 4)
            isCorrect = Validate.validFour(word);
        else if (position == 5)
            isCorrect = Validate.validFive(word);
        else if (position == 6)
            isCorrect = Validate.validSix(word);
        else
            isCorrect = Validate.validSeven(word);

        if (isCorrect)
        {
            System.out.println("Correct!");
            System.out.println();
            lucky();
        }
        else {
            System.out.println("Wrong! You've returned to Position 3.");
            position = 3;
        }
    }//End shoot().

    //When typing the correct answer, the Critical Rate is boosted.
    //This determines whether the user officially makes the basket.
    public void lucky() throws InterruptedException {
        //Correct answers boost Critical Rate by 10%.
        if (critRate < 1.0)
            critRate += 0.10;

        //The rate is transformed into a solid integer to make
        //comparisons with the random number easier.
        int rate = (int)((critRate * 10));
        int num = (int)(Math.random() * 11);

        //Comparison between rate and random number
        //that defines whether the user makes the shot.
        if (num <= rate && position < 8)
        {
            System.out.println("You made it in!");
            score += position;
            System.out.println("Your score is " + score + ".");
            position++;
            TimeUnit.SECONDS.sleep(1);
        }
        else
        {
            System.out.println("Ouch, you did not make it...");
            critRate = 0.30; //Resets the Critical Rate.
            position = 3;
        }
    }

    public String prompt()
    {
        String question = "";
        String pattern = "\nPattern: ";
        if (position == 3) {
            question += "Question: Any word.";
            pattern += "[consonant][vowel][consonant]";
        }
        else if (position == 4) {
            question += "Question: Related to scoring.";
            pattern += "[consonant][any][any][consonant]";
        }
        else if (position == 5) {
            question += "Question: The ball cannot land outside the _____.";
            pattern += "[consonant][vowel][vowel][consonant][consonant]";
        }
        else if (position == 6) {
            question += "Question: A famous basketball player.";
            pattern += "[consonant][any][any][any][any][consonant]";
        }
        else {
            question += "Question: The date of either Space Jam movies' release.";
            pattern += "[number][number][number][number]";
        }
        return question + pattern;
    }

    //Lists all attributes.
    public String toString()
    {
        String output = "Username: " + username +
                        "\nStart Position: " + position +
                        "\nCurrent Score: " + score;
        return output;
    }
}
