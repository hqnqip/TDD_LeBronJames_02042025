import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

class RivalTest
{
    //Testing the chances of this "AI" opponent scoring.
    @org.junit.jupiter.api.Test
    void shoot()
    {
        int coin = (int)(Math.random() * 2);
        double critRate = 0.2;

        if (coin == 1)
        {
            System.out.println("They answered the prompt correctly!");
            critRate += 0.10;

            int rate = (int)((critRate * 10));
            int num = (int)(Math.random() * 11);
            System.out.println(num + " vs. " + rate);

            if (num <= rate)
            {
                System.out.println("They made it in!");
            }
            else
            {
                System.out.println("They did not make it in.");
            }
        }
        else
        {
            System.out.println("They did not answer the prompt correctly.");
        }
    }
}