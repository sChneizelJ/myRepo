	
/* ***************************************
   AUTHOR: Sm Shahnaiz
	This is an interactive chatbot named Chatty.
   ****************************************/

class chatbot1
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
		
		welcomeMessage();
		helloMessage();
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
        System.out.println("My name is Chatty");
        System.out.println("Nice to meet you.");
	 
	
	    return;
    } // END helloMessage
	
} // END class chatbot1
