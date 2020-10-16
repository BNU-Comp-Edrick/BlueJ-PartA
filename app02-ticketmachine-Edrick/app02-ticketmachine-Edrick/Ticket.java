import java.util.Date;

/**
 * This class will hold infromation about a ticket
 * this will include the price, issued date and time
 * and the destination
 *
 * @author Edrick Yapi(22014511)
 * @version 09/10/2020
 * @modified 16/10/2020
 */
public class Ticket
{
    // Attribute, Fields, Variables
    private String destination;
    
    //currency is in pence
    private int price;
    
    private Date issueDateTime;

    /**
     * Constructor for objects of class Ticket
     * method to set the destination and price of a ticket
     * 
     */
    public Ticket(String destination, int price)
    {
      this.destination = destination;
      this.price = price;
      
      issueDateTime = new Date();
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.println();
        System.out.print("Destination: " + destination);
        System.out.println();
        System.out.print("Price: " + price + "p");
        System.out.println();
        System.out.print(issueDateTime);
        System.out.println();
    }

}
