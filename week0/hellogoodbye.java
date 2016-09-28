/* ***************************************
   AUTHOR: Sm Shahniaz
	This is a chatbot named Chatty
   ****************************************/

class chatbot2
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
        // THEN print out the message as given by method goodbyeMessage 
		
		welcomeMessage();
		helloMessage();
		nicemessage();
		goodbyeMessage();
		System.exit(0);
		
    } // END main
	
	public static void welcomeMessage() 
	{
	
		System.out.println("Welcome to Chatty. He is an interactive chatbot.");
		System.out.println("Hope you have a great time chatting.");
		
		return;
	} // END welcomeMessage

	
    public static void helloMessage ()
    {
        System.out.println("Hello"); 
        System.out.println("I just woke up"); 
	
	    return;
    } // END helloMessage
    
    public static void nicemessage() 
    {
    	System.out.println("Say something nice to everyone you meet today. (They think you are mad!)");
    	
    	return;
    
    } // END nicemessage
	
    public static void goodbyeMessage ()
    {
        System.out.println("Bye"); 
        System.out.println("I'm going back to sleep"); 
	
	    return;
    } // END goodbyeMessage
	
} // END class hellogoodbye
