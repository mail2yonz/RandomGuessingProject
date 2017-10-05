import java.util.Random;
import java.util.Scanner;

public class RandomGuessing {
    public static void main(String[] args)
    {
        Random rand= new Random ();
        String ans;
        int randInt =1+ rand.nextInt (100);
        System.out.println(randInt);
        output("Guess a number between 1 and a 100:");
        Scanner scan = new Scanner (System.in);

        int guessedNum= scan.nextInt ();


            if(randInt==guessedNum)
            {
                output ( "Guessed Right" );

             } else if (randInt< guessedNum)
            {
                output ( "Too high" );
            } else if(randInt>guessedNum)
            {
                output("Too low");
            }


    }
    private static void output(String outString)
    {
         System.out.println(outString);
    }
}
