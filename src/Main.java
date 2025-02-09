import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Scanner key = new Scanner(System.in);
        String response; //Keeps track of user's response.
        LeBron player; //The user's game character.

        //Defines the stats based on username.
        System.out.println("Hello! Welcome to Around LeBron's World! " +
                            "\nType your username! Use the format: @[lowercase]" +
                            "\nOtherwise, you play as a guest.");
        response = key.nextLine();
        if (Validate.validUser(response)) {
            player = new LeBron(response);
        }
        else {
            System.out.println("This username is invalid. You are registered as a guest instead." +
                                "\nYou will be defaulted to @lebronjames.");
            player = new LeBron();
        }

        //Wait 1 second.
        TimeUnit.SECONDS.sleep(1);

        //Prints out the character's stats.
        System.out.println("\n" + player.toString());

        //Wait 1 second.
        TimeUnit.SECONDS.sleep(1);

        //Game Text
        System.out.println("\nSynopsis: You will be playing against... Bugs Bunny!");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Imagine a basket and a white half-circle painted around it.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You stand from the beginning of the circle, called Position 3.");
        System.out.println("Depending on the position, you're given a prompt/question to answer.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("If you answer correctly, your chance of making the hoop increases by 10%!");
        System.out.println("Otherwise, you automatically reset to Position 3.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Make the hoop to increase your score by the position number and advance to the next position.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nGOAL: FINISH THE HALF-CIRCLE AT POSITION 7 OR REACH 30 POINTS.");

        //Actual Game
        while (player.score < 30 && player.position < 8)
        {
            System.out.println();
            System.out.println("You are on Position " + player.position + ".");
            if (player.position < 7)
                System.out.println("Instructions: Type a word that has " + player.position + " letters.");
            else
                System.out.println("Instructions: Type a number.");
            System.out.println(player.prompt());
            response = key.nextLine();
            player.shoot(response);
        }

        System.out.println("You won!");

    }//End main().
}//End Main Class.

//Have it so that each word they type in that's correct. It boosts crit rate
//which will be used in randomNumber to define the shoot's success.
//Basically using the words to boost the player's luck.
//Crit rate resets when streak is lost.
//Have the validWords with a certain number of vowels.