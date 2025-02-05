public class LeBron
{
    //Variables
    protected String username;
    //protected double critRate;
    protected int position;
    protected int score;

    //Default Constructor
    public LeBron ()
    {
        username = "@lebronjames";
        //critRate = 0.80;
        position = 4;
    }

    //Custom Constructor
    public LeBron (String username)
    {
        this.username = username;
        //critRate = 0.10;
        position = 2;
    }

    //Method
    public void shoot(String word)
    {
        boolean isCorrect = false;
        if (position == 2)
            isCorrect = Validate.validTwo(word);
        else if (position == 3)
            isCorrect = Validate.validThree(word);
        else
            isCorrect = Validate.validFour(word);

        if (isCorrect)
        {
            System.out.println("Correct! There are " + position + " letters in this word!");
            score += position;
            position++;
        }
        else {
            System.out.println("Wrong! You need " + position + " letters! You've returned to position two.");
            position = 2;
        }
    }//End shoot().

    public String toString()
    {
        String output = "Username: " + username +
                        "\nStart Position: " + position +
                        "\nCurrent Score: " + score;
        return output;
    }
}
