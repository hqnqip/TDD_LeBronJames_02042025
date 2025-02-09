import java.util.concurrent.TimeUnit;

public class Rival
{
    //Variables
    protected String username;
    protected double critRate;
    protected int position;
    protected int score;

    public Rival (String username)
    {
        this.username = username;
        position = 3;
        score = 0;

        if (username.equals("@bugsbunny"))
            critRate = 0.4;
        else if (username.equals("@lolabunny"))
            critRate = 0.5;
        else
            critRate = 0.3;
    } //Probably make a test that ensures different usernames get different rates.

    public void shoot() throws InterruptedException
    {
        System.out.println(username + " is on Position " + position + ".");

        int coin = (int)(Math.random() * 2);
        //Instead of doing word prompts, I did a random number for simplicity.

        if (coin == 1 && critRate < 1.0)
        {
            System.out.println(username + " answered the prompt correctly!");
            critRate += 0.10;

            int rate = (int)((critRate * 10));
            int num = (int)(Math.random() * 11);

            if (num <= rate && position < 8)
            {
                System.out.println(username + " made it in!");
                score += position;
                System.out.println(username + "'s score is " + score + ".");
                position++;
                TimeUnit.SECONDS.sleep(1);
            }
            else
            {
                System.out.println(username + " did not make it in.");
                System.out.println(username + " returns to Position 3.");
                critRate = 0.30; //Resets the Critical Rate.
                position = 3;
            }
        }
        else
        {
            System.out.println(username + " did not answer the prompt correctly." +
                                "\n" + username + " returned to Position 3.");
            position = 3;
        }
    }
}
