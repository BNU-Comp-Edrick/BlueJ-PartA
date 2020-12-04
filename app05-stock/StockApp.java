
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author
 * @version 01/12/2020
 * @modified by Edrick
 */
public class StockApp
{
    public static final char CLEAR_CODE = '\u000c';
    public static final String QUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT_ALL = "printall";
    public static final String SEARCH = "search";
    public static final String SELL = "sell";
    public static final String DELIVER = "deliver";
    public static final String LOW_STOCK = "low stock";
    public static final String REMOVE = "remove";
    // Use to get user input
    private InputReader input = new InputReader();
    
    private StockManager manager = new StockManager();
    
    private StockDemo demo = new StockDemo(manager);
    
    /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString().toLowerCase();
            if(choice.equals(QUIT))
                finished = true;
            else    
                executeMenuChoice(choice);
        }
    }
    
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if(choice.equals(PRINT_ALL))
        {
            manager.printAllProducts();
            String value = input.getString();
        }
        else if(choice.equals(SELL))
        {
            sell();
        }
        else if(choice.equals(SEARCH))
        {
            search();
        }
        else if(choice.equals(DELIVER))
        {
            deliver();
        }
        else if(choice.equals(LOW_STOCK))
        {
            lowStock();
        }
        else if(choice.equals(REMOVE))
        {
            remove();
        }
        
    }
    
    private void addProduct()
    {
        System.out.println("Adding new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        
        System.out.println();
    }
    
    /**
     * method to sell the product(s)
     */
    public void sell()
    {
        System.out.println("Sell a product\n");

        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the product ID");
        String stockAmount = input.getString();
        int amount = Integer.parseInt(stockAmount);
        
        manager.sellProduct(id, amount); 
    }
    
    /**
     * search for product(s) using part of the name
     */
    public void search()
    {
        System.out.println("Searching for product(s) by name...\n");

        System.out.println("Please enter the name of the product(s)\n");
        String keyword = input.getString();

        demo.search(keyword);
    }
    
    /**
     * deliver product to increase stock
     */
    public void deliver()
    {
        System.out.println("Delivery of a product\n");

        System.out.println("Please enter the product ID\n");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the amount you wish to have delivered\n");
        String stockAmount = input.getString();
        int amount = Integer.parseInt(stockAmount);

        manager.delivery(id, amount);
    }
    
    /**
     * displaying stock which are low level
     */
    public void lowStock()
    {
        manager.printLowInStock();
    }
    
    /**
     * removing a desired product from the stock list
     */
    public void remove()
    {
        System.out.println("Remove Product...\n");
        
        System.out.println("Enter product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        manager.removeProduct(id);
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Search:     Search for a product");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Deliver:    Order a delivery of products");
        System.out.println("    Low Stock:  List of products that are low in stock");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        //System.out.println(CLEAR_CODE);
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("      App05: by Edrick");
        System.out.println("******************************");
    }
}
