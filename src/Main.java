import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        String response;
        LeBron player;

        System.out.println("Hello! Type in your username! Use the format: @[lowercase]");
        response = key.nextLine();
        if (Validate.validUser(response)) {
            player = new LeBron(response);
        }
        else {
            System.out.println("This username is invalid. You will be defaulted to @LeBronJames");
            player = new LeBron();
        }

        System.out.println(player.toString());

        while (player.score < 9)
        {
            System.out.println("Type a word that has " + player.position + " letters.");
            response = key.nextLine();
            player.shoot(response);
        }

        System.out.println("You made it to 9 points!");
    }//End main.
}//End Main.

//Have it so that each word they type in that's correct. It boosts crit rate
//which will be used in randomNumber to define the shoot's success.
//Basically using the words to boost the player's luck.
//Crit rate resets when streak is lost.
//Have the validWords with a certain number of vowels.