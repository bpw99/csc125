package PasswordHacker;

import java.util.concurrent.TimeUnit;

import ref.Website;

public class PasswordGuesser 
{
	/* Do not change any of the code here,
	 * Or bad things will happen.
	 */
	private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private static String user1 = "Larry";
	private static String user2 = "Curly";
	private static String user3 = "Moe";
	
	private static String testUser1 = "Bieber";
	private static String testUser2 = "Paurus";
	
	private static boolean passwordFound = false;
	private static String crackedPassword = "";
	

	/*
	 * Your goal to crack the passwords of Larry, Curly and Moe
	 * (user1, user2, user3 as declared above).  Do this by
	 * writing loops that try all the passwords for a given length.
	 * You do know:
	 * 		Larry's password is length 4
	 * 		Moe's password is length 4
	 * 		Curly's password is length 6
	 * 		Bieber's password is length 2 (we went over this in class)
	 * 		Paurus's password is length 3 (we went over this in class)
	 * The code from class can be found in the Cyber Security Folder in the
	 * Google Drive coding folder (something like
	 * PasswordGuesser.java), use it as a reference.
	 * There are two options here, write a method that crack's passwords
	 * that are specifically length 4 and 6 or write a generic method that can 
	 * crack a password of any length (which is harder but more useful).  
	 * It's your choice, your grade is determined based on the ability to
	 * figure out Larry, Curly and Moe's passwords, regardless of how
	 * you do it.  The program should output each password, like
	 * 	"Larry's password is:  bugs"
	 *  "Moe's password is:  food"
	 *  "Curly's password is:  passwd"
	 *  
	 *  Once you have included the Webiste.jar file, you can check
	 *  a password like this:  Website.checkLogin(username, password).
	 *  The method returns a boolean:  true if the login worked, false 
	 *  if it failed.  To check if Larry's password is dogs, you would do this:
	 *  Website.checkLogin("Larry", "dogs");
	 *  If you need more help, look at the PasswordGuesser.java we created in
	 *  class.
	 */
	
	
	public static void main(String[] args)
	{
		//Record the time in nano seconds
		long startTime = System.nanoTime();


		//Your code goes here!
		//Crack the password for Larry, Curly, and Moe!
		
		crackLengthFourPassowrd("Larry");

		
		//Record the time now that the password has been cracked,
		//this will determine how long it took to crack the password.
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("This took: " + TimeUnit.SECONDS.convert(duration, TimeUnit.NANOSECONDS) + " seconds.");

	}

	private static void crackLengthFourPassowrd(String user) 
	{
		//When you get a matching password, print it to out.
		System.out.println("Password hacking is beginning.....");	
	}
}
