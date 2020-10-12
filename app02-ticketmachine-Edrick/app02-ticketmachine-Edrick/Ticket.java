import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author Edrick Yapi(22014511)
 * @version 09/10/2020
 */
public class Ticket
{
    // Attribute, Fields, Variables
    private String destination;
    
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
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("Ticket " + destination +
           " Price: " + price +
           " Issued: " + issueDateTime);
    }

}
