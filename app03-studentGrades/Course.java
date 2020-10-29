
/**
 * This class contains the information about the courses in which students
 * would like to enrol on
 *
 * @author Edrick Yapi (22014511)
 * @version 29/10/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    // these instance variables are for the course details.
    private String codeNumber;
    private String title;
    
    //these instance variables are for the modules to be linked to this class
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    //these instance variables are for the overall grades
    private int totalMark;
    private String overallGrade;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNumber, String title)
    {
        // initialise instance variables
        this.codeNumber = codeNumber;
        this.title = title;
        
        this.totalMark = 0;
        this.overallGrade = null;
        
        createModules();
    }
    
    public void createModules()
    {
        module1 = new Module("CO452", "Programming Concepts");
        module2 = new Module("CO450", "Computer Architecture");
        module3 = new Module("CO454", "Digital Tech");
        module4 = new Module("CO456", "Web Development");
    }
    
    public void addModule(Module module, int moduleNumber)
    {
        if(moduleNumber == 1)
        {
            this.module1 = module;
        }
        else if(moduleNumber == 2)
        {
            this.module2 = module;
        }
        else if(moduleNumber == 3)
        {
            this.module3 = module;
        }
        else if(moduleNumber == 4)
        {
            this.module4 = module;
        }
    }
    
    public void setMark(int mark, String codeNumber)
    {
        if(module1.getCodeNumber() == codeNumber)
        {
            module1.awardMark(mark);
        }
        else if(module2.getCodeNumber() == codeNumber)
        {
            module2.awardMark(mark);
        }
        else if(module3.getCodeNumber() == codeNumber)
        {
            module3.awardMark(mark);
        }
        else if(module4.getCodeNumber() == codeNumber)
        {
            module4.awardMark(mark);
        }
    }
    
    /**
     * Calculation for the marks
     * 
     */
    public void calculateTotalMark()
    {
        if(courseCompleted())
        {
            int totalMark = module1.getMark() + module2.getMark() + module3.getMark() 
            + module4.getMark();
            
            totalMark = totalMark / 4;
            print();
        }
        else
        {
            
        }
    }
    
    public boolean courseCompleted()
    {
        if((module1.isCompleted()) && (module2.isCompleted()))
        {
            return true;
        }
        else return false;
    }
    
    /**
     * prints out the course details
     */
    public void print()
    {
        System.out.println("Course " + codeNumber + " ~ " + title);
        System.out.println("Module~");
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
    
    public void printModules()
    {
        if(courseCompleted())
        {
            System.out.println("Final Marks = " + totalMark);
        }
    }
}
