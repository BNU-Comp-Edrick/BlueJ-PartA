
/**
 * Class will hold information about the courses
 * 
 *
 * @author Edrick Yapi (22014511)
 * @version (a version number or a date)
 */
public class Course
{
    // Attribute, Fields, Variables
    private String title;
    
    private String codeNo;

    /**
     * Constructor for objects of class Course
     * Allows each course to have a name and a course number input
     */
    public Course(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
    }
    
    /**
     * this method prints out the information in the course class
     */
    public void print()
    {
       System.out.println("Course: " + title + " " + codeNo); 
    }
}
