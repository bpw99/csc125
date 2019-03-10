

public class TeacherRunner 
{
	/*
	 * You do NOT need to change this file.
	 * Just put it in the same location as your
	 * Teacher.java and run it to make sure it passes
	 * the test cases below.
	 */
	
	public static void main(String[] args) 
	{
		Teacher wespetal = new Teacher("Wespetal", 
									   "When elected, what will Donald Trump do about immigration? " +
									   "Nothing: He will be too busy dealing with hell freezing over."	,
									   40.0);
		
		Teacher litchy = new Teacher("Litchy", 
				   "3 out of 2 people have problems with fractions.",
				   1000000.0);
		
		Teacher lammers = new Teacher("Lammers", 
				   "Parallel Lines:  have so much in common...... its a shame " +
				   "that they will never meet.",
				   400000.0);
		
		wespetal.addFriend(litchy);
		wespetal.addFriend(lammers);
		wespetal.removeFriend(litchy);
		
		System.out.println("Wespetal joke: " + wespetal.getJoke());
		System.out.println("Wespetal net worth: " + wespetal.getNetWorth());
		System.out.println("Wespetal isFriend with litchy "
				+ "should be false and is: " + wespetal.hasFriend(litchy));
		System.out.println("Wespetal isFriend with Lammers "
				+ "should be true and is: " + wespetal.hasFriend(lammers));		
		System.out.println("Lammers isFriend with Wespetal "
				+ "should be false and is: " + lammers.hasFriend(wespetal));
		
		litchy.addFriend(wespetal);
		litchy.addFriend(lammers);
		System.out.println("Litchy isFriend with Wespetal "
				+ "should be true and is: " + litchy.hasFriend(wespetal));
		System.out.println("Litchy isFriend with Lammers "
				+ "should be true and is: " + litchy.hasFriend(lammers));
		
	}

}
