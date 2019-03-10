public class CarProblem 
{
    private double price;
    private double mpg;
    private double TotalCost;

    public CarProblem(double myPrice, double myMpg)
    {
        price = myPrice;
        mpg = myMpg;
    }

    public void CalcBestCar()
    {
        double FuelCost = 15000/mpg * 4;
        FuelCost = FuelCost * 10;
        TotalCost = FuelCost + price;
    }
    public double getTotal()
    {
        return TotalCost;
    }
    public void setPrice(double priceIN)
    {
        price = priceIN;
    }
    
    public void setMpg(double mpgIN)
    {
        mpg = mpgIN;
    }
    public double getPrice()
    {
        return price;
        
    }
    public double getMpg()
    {
        return mpg;
    }
}
