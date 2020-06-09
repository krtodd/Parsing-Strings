package Parse;
import java.util.Scanner;

public class ParseStrings {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); //input stream for standard input
	    Scanner inSS = null; //input string stream
	      
	      String lineString;
	      int commaLocation;
	      String firstWord;
	      String secondWord;
	      boolean inputDone = false;
	      
	      while (!inputDone){
	          System.out.println("Enter input string: ");
	          lineString = scnr.nextLine(); //entire line into lineString
	          commaLocation = lineString.indexOf(','); //find the location of the comma in the string

	             
	          if (lineString.equals("q")) { //quits program if input is "q"
	             inputDone = true;
	             break;
	        }
	       
	          else {
	                while (commaLocation == -1) { //if there is no comma in the string
	                   System.out.println("Error: No comma in string");
	                   System.out.println("Enter input string: ");
	                   lineString = scnr.nextLine();
	                }
	           }
	           
	          firstWord = lineString.substring(0, commaLocation).replace(" ", ""); //intializing firstWord and replacing spaces with no spaces
	          secondWord = lineString.substring(commaLocation + 1, lineString.length()).replace(" ", "");//initializing secondWord and replacing spaces with no spaces
	       
	          System.out.println("First word: " + firstWord);
	          System.out.println("Second word: " + secondWord);
	          System.out.println("");
	          System.out.println("");
	       }
	       
	       return;
	    }
	 }
