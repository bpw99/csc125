
public class Teacher 
{

	//Add the correct instance variables here.
	//See the printed directions for more information.
	//You will need to use an 'ArrayList<Teacher> friends' variable.

	
	
	//Create a constructor that takes in the teachers name,
	//joke, and netWorth and set the instance variables.
	//You will also need to set the friends ArrayList to
	//an empty ArrayList like this:  friends = new ArrayList<Teacher>();
	
	//Adds the otherUser to the ArrayList of Teachers friends
	//You can assume that each Teacher has a unique name
	public void addFriend(Teacher otherTeacher)
	

	//Removes the otherUser from the ArrayList of Teacher friends
	//You will need to loop through the this teachers ArrayList
	//of friends and find and remove the one that matches
	//the name of the input variable "otherTeacher".
	public void removeFriend(Teacher otherTeacher)
	
	//Returns 'true' if otherUser is in the ArrayList of Teacher friends
	//'false' otherwise.  Again you can assume each teacher's name is unique.
	//Again, you will need to loop through this teachers ArrayList
	//of friends to see if one has the same name as 'otherTeacher'.
	public boolean hasFriend(Teacher otherTeacher)
	
	//Returns the teacher's favorite joke
	public String getJoke()
	
	//Returns the teacher's net worth
	public double getNetWorth()
	
	//Returns the name of the teacher
	//Each teacher has a unique name!!
	public String getName()

	//Constructor:  set the instance variable to the input values
	Teacher(String nameIn, String jokeIn, double netWorthIn)
	
	//No default constructor here!
}
