
public class PythagoreanRunner 
{
	/*
	 * You do NOT need to change this file.
	 * Just put it in the same location as your
	 * PythagoreanHelper.java file and run it to make 
	 * sure it passes
	 * the test cases below.
	 */ 
	
	public static void main(String[] args) 
	{
		double test1 = PythagoreanHelper.findHyp(3, 4);
		System.out.println("Test 1 should be 5 and is: " + test1);
		
		double test2 = PythagoreanHelper.findLeg(5, 13);
		System.out.println("Test 2 should be 12 and is: " + test2);
		
		double test3 = PythagoreanHelper.findLeg(7, 15);
		System.out.println("Test 3 should be 13.266 and is: " + test3);
		
		double test4 = PythagoreanHelper.findHyp(8, 8);
		System.out.println("Test 4 should be 11.314 and is: " + test4);
	}

}
