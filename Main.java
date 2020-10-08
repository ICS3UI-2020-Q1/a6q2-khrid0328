import java.util.Scanner;
/**
 * This program populates a 10 element array with integers. Once the array is full, the user enters a number to search for. This program then searches through the array and state any index that the number is located at. 
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // declare a constant
    final int TEN_ELEMENTS = 10;

    // create an array with 10 spots
    double[] elements = new double[TEN_ELEMENTS];
    
    // ask the user to type 10 elements
    System.out.println("Please enter in 10 integers to put into the array");

    // put something into the array using a loop
    for(int i =0; i < 10; i++){

      // putting the user value into the array
      elements[i] = input.nextInt();
    }

    // enter a number to find 
    System.out.println("Please enter a number to find");

    // create a variable for user input
    int number_To_Find = input.nextInt();

    // use a for loop to determine where the number to find is located
    for(int i = 0; i < 10; i++){

      // use an if statement to determine where the number to find is located
      if(number_To_Find == elements[i]){

        // print the index to the screen
       System.out.println(number_To_Find + " is located at index " + i);
      }
    }
  }
}
