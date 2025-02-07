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
        critRate = 0.80;
        position = 4;
    }

    //Custom Constructor
    public LeBron (String username)
    {
        this.username = username;
        critRate = 0.20;
        position = 3;
    }

    //Method
    //Assigns a different word prompt based on user's position.
    public void shoot(String word)
    {
        boolean isCorrect = false;
        if (position == 3)
            isCorrect = Validate.validThree(word);
        else if (position == 4)
            isCorrect = Validate.validFour(word);
        else
            isCorrect = Validate.validFive(word);

        if (isCorrect)
        {
            System.out.println("Correct! There are " + position + " letters in this word!");
            System.out.println();
            lucky();
        }
        else {
            System.out.println("Wrong! You need " + position + " letters! You've returned to position two.");
            System.out.println();
            position = 2;
        }
    }//End shoot().

    //When typing the correct answer, the Critical Rate is boosted.
    //This determines whether the user officially makes the basket.
    public void lucky()
    {
        //Correct answers boost Critical Rate by 10%.
        if (critRate < 1.0)
            critRate += 0.10;

        //The rate is transformed into a solid integer to make
        //comparisons with the random number easier.
        int rate = (int)((critRate * 10));
        int num = (int)(Math.random() * 11);

        //Comparison between rate and random number
        //that defines whether the user makes the shot.
        if (num <= rate)
        {
            System.out.println("You made it in!");
            System.out.println();
            score += position;
            position++;
        }
        else
        {
            System.out.println("Ouch, you did not make it...");
            System.out.println();
            critRate = 0.20; //Resets the Critical Rate.
        }
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
