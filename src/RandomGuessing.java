import java.util.Random;
import java.util.Scanner;

//This code guesses a random number and lets you know if your guess is equal or not
public class RandomGuessing {
    public static void main(String[] args)
    {
        Random rand= new Random();

        int randInt =1+ rand.nextInt (100);
        System.out.println(randInt);



        Scanner scan = new Scanner (System.in);

         do  {

             output("Guess a number between 1 and a 100:");
             int guessedNum= scan.nextInt ();




               if( randInt>guessedNum) {
                   output("The number is Too low,Do you want to try again yes/no");
               } else if (randInt< guessedNum)
               {
                   output ( "The number is Too high,Do you want to try again yes/no" );

               } else if(randInt==guessedNum)
               {
                   output ( "Guessed Right!" );
                    break;
               }

             output("Do you want to continue Yes or No");



           }while (scan.next().equalsIgnoreCase("yes"));



    }
    private static void output(String outString)
    {
         System.out.println(outString);
    }
}
