
/* ***************************************
   AUTHOR: Sm Shahniaz
	This program is the interactive chatbot named Gummy.
	And this is the Header File.
   ****************************************/

class chatbot1
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage

		helloMessage();
		System.exit(0);

    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */

	/* ***************************************
	*
	*	Define a method to print a welcome message
	*/

    public static void helloMessage ()
    {

        System.out.println("Hello, my name is Gummy");
        System.out.println("I am a chat bot.");




	    return;
    } // END helloMessage

} // END class hello
