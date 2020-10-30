
/**
 * This class holds information about the modules that will be held
 *
 * @author Edrick Yapi (22014511)
 * @version 29/10/2020
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String title;
    private String codeNumber;
    private int mark;
    private int credit;
    
    private boolean completed;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNumber)
    {
        // initialise instance variables
        this.title = title;
        this.codeNumber = codeNumber;
        
        mark = -1;
        credit = 0;
        
        completed = false;
    }
    
    public void awardMark(int mark)
    {
        this.mark = mark;
    }
    
    public int getMark()
    {
        return mark;
    }
    
    public String getCodeNumber()
    {
        return codeNumber;
    }
    
    public boolean isCompleted()
    {
        if(mark >= 40)
        {
            credit = 15;
            return true;
        }
        return false;
    }
    
    public void print()
    {
        System.out.println("Module: " + title + " " + codeNumber + " Mark = " + mark);
    }
}
