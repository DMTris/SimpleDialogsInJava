/*
*  Project :  A03c   -  Simple Dialogs
*  File    :  Guess2.java
*  Name    :  Chris Langdale
*  Date    :  09/14/17(09/19/17)
*
*  Description :  CSIS 1400 Guess2 - if...else nested in a while loop.  Change input and output statements to use JOptionPane.
*/

import javax.swing.JOptionPane;

public class Guess2 
{ 
	public static void main(String[] args) 
	{
		//declare variables
      int myGuess;
		final int NUMBER_TO_GUESS = 13;
      String inputGuess;
      
      //show introduction message with JOptionPane
      JOptionPane.showMessageDialog(null, String.format("%nWelcome to Guess-My-Number%nA GAME of CHANCE and SKILL%nLet's Play!%n%n"));
      
      //prompt to enter a guess with JOptionPane
      inputGuess = JOptionPane.showInputDialog("Enter a number between 1 and 25: ");
      myGuess = Integer.parseInt(inputGuess);
      
      //start while loop
   	while( myGuess != NUMBER_TO_GUESS )
		{  
		   //good or bad guess??
         if(myGuess < NUMBER_TO_GUESS) //too low
         JOptionPane.showMessageDialog(null, String.format("Your guess [ %d ] is too low...%nTry Again!%n", myGuess));
         
         else  //too high
         JOptionPane.showMessageDialog(null, String.format("Your guess [ %d ] is too high...%nTry Again!%n", myGuess));

	      //prompt to try a new guess and convert it to an integer
         inputGuess = JOptionPane.showInputDialog("Enter a number between 1 and 25: ");
         myGuess = Integer.parseInt(inputGuess);
		}//end while loop
		
      //if it is a good guess display dialog box
      JOptionPane.showMessageDialog(null, String.format("Your guess [ %d ] is the number...%nCongratulations!%n", myGuess));

	}//end main()

}//end Guess2