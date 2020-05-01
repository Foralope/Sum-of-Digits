/*
 * William Zwart
 * A program to print out the value of the sum of the digits of a positive integer.
 * 
 */

package sum.of.digits;
import java.util.*;
/**
 *
 * @author William Zwart
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables and getting the given value.
        int added = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type your non negative integer below here and then press enter:");
        int given = userInput.nextInt();
        //Getting the answer.
        int charactersAdded = solution(given,added);
        //Printing out the answer.
        System.out.println("The sum of all of the individual digits of the given number is: " + charactersAdded);
    }
    
    public static int solution(int given,int added){
        //Setting up some ints for an if else statement.
        int characterAmount = String.valueOf(given).length();
        //Determining if it has been divided by 10 sufficiently while storing answers added together.
        if(characterAmount==1){
            added = added + given%10;
        }else{
            added = added + given%10;
            return solution(given/10,added);
        }
        return added;
    }
    
}