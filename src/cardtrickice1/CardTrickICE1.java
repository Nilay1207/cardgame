/* STUDENT ID: 991662741
 */
package cardtrickice1;

import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author NILAYKUMAR CHAUHAN,May 29th
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);//scanner object
        String[] stringArray = new String[7];// array of string to store 7 cards name
        int intArray[] = new int[7];//array of integers to store the values of 7 cards
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(c1.randomValue());//use a method to generate random *13
            c1.setSuits(c1.randomSuit());//random method suit 
            magicHand[i]=c1;
        }
        int c=0;//counter 1
        for (Card magicHand1 : magicHand) {
            System.out.println(magicHand1.getSuits() + " " + magicHand1.getValue());
            stringArray[c]=magicHand1.getSuits();//storing the names of cards into array of strings
            intArray[c]=magicHand1.getValue();//storing the values
            c++;
        }
        System.out.println("Please choose the suit:\n1: Hearts\n2: Diamonds\n3: Spades\n4: Clubs");
        int suit = input.nextInt();//taking the input
        String [] SUITS = { "hearts","diamonds","spades","clubs"};
        System.out.println("Please choose the value (1 to 12)");
        int value = input.nextInt();//taking the input
        
        //step 3: match with array
        int count = 0;//counter 2
        for (int j=0;j<7;j++) {
            if(!SUITS[suit-1].equals(stringArray[j]) || value != intArray[j])
            { 
            } else {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Great Work :)");
        }
        else
        {
            System.out.println("Sorry, no match");
        }
    }
    
}
