import java.util.Scanner; // Needed to make Scanner available

/* AUTHOR Sm Shahniaz

  this is a chatbot for fun.
 */
class keyboardinput1
{

  public static void main (String[] p)
  {
     askquestions();
     System.exit(0);

  } //END main
  
  
  public static void askquestions ()
  {
     String name;
     String faveColor;
     String eyeColor;
     String hairColor;
	 String gender;	
	     
     // create a scanner so we can read the command-line input
    Scanner scanner = new Scanner(System.in);
	
	System.out.println("What is your name?");
	
	name = scanner.nextLine();
    //  ask for the person's name
    System.out.println("What is your favourite color? ^-^");

    // get their name as a String and store in variable name
    faveColor = scanner.nextLine();

    //  ask a question
    System.out.println("What is your eye color? ^-^");

    // get their input as a String and store in a different variable theylove
    eyeColor = scanner.nextLine();
    
    System.out.println("What is your hair color?");
    
    hairColor = scanner.nextLine();
    
    System.out.println("What is your gender? [M/F]")
    
    gender = scanner.nextLine();
    
    if (gender.equals("M")) 
    {
    	"
    }
    

    System.out.println(name + " has " + eyeColor + " eyes " + " and " + hairColor + " hair, likes the colour " + faveColor + " and is handsome. ^-^");
    
    return;
  } // END askquestions

} // END keyboardinput1
