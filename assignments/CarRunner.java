
public class CarRunner
{
	public static void main(String[] args)
	{
		
		CarProblem Car1 = new CarProblem(17999, 17);
		CarProblem Car2 = new CarProblem(20999, 25);
		
		Car1.CalcBestCar();
		Car2.CalcBestCar();
		
		double price1 = Car1.getTotal();
		double price2 = Car2.getTotal();
		System.out.println("Retail price of Car 1: " + "$" + Car1.getPrice());
		System.out.println("mpg of Car 1: " + Car1.getMpg() + " miles per gallon");
		System.out.println("Retail price of Car 2: " + "$" + Car2.getPrice());
		System.out.println("mpg of Car 2: " + Car2.getMpg() + " miles per gallon");
		if(price2 > price1)
		{
		System.out.println("Car number 1 is the best deal because the total cost of Car 1 for 10 years is " + "$" + (int) price1 + " and the total cost of car 2 for 10 years is " + "$" + (int) price2);
		}
		
		else
		{
			System.out.println("Car number 2 is the best deal because the total cost of Car 2 for 10 years is " + "$" + (int) price2 + " and the total cost of car 1 for 10 years is " + "$" + (int)  price1);
		}
	}

}
