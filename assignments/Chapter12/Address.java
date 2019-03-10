package Chapter12;


/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address
{
  private String name;
  private String street;
  private String city;
  private String state;
  private String zip;
  
  public Address(String nameIN, String streetIN, String cityIN, String stateIN, String zipIN)
  {
      name = nameIN;
      street = streetIN;
      city = cityIN;
      state = stateIN;
      zip = zipIN;
      
      
      
   }
   
   public String format()
   {
       return name + "\n" + street + "\n" + city + ", " + state + " " + zip;
    }
  
}