import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

class MainTest
{
    @org.junit.jupiter.api.Test
    void compareSides () throws InterruptedException
    {
        LeBron player = new LeBron();
        Rival rival = new Rival("@spacealien");
        player.setPosition(7);
        rival.setPosition(7);
        player.setScore(23);
        rival.setScore(23);

        String response = "1996";

        player.shoot(response);
        rival.shoot();

        System.out.println("\nScoring: " + player.score + " vs. " + rival.score);
        System.out.println("\nPosition: " + player.position + " vs. " + rival.position);

        if ((player.score > rival.score) || (player.position == 8))
            System.out.println("You won!");
        else
            System.out.println("Aww. Better luck next time.");
    }

    @org.junit.jupiter.api.Test
    void testBoJack () throws InterruptedException
    {
        LeBron player = new LeBron();
        player.setPosition(3);

        while (player.position < 4)
        {
            System.out.println("You are on Position " + player.position + ".");
            player.shoot("bid");
            player.boJackInspires();
        }
    }
}