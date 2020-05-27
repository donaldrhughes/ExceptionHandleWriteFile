// —> Course Class file --> Course.java 

package u2a1_readtextfilehandleexcep;

/**
 *
 * @author donaldrhughes
 */
// Mobile Cloud Computing Application Development
public class Course {

    // Class Attributes
    public String code = "";    // Code attribute - a string field to store the course code (e.g. IT4789)
    public int creditHours = 0; // CreditHours attribute – int - store credit hours of a course
    public String name = "";   // Name attribute – a string field to store the course's name

    public Course() {
    }

    // Class Constructor with params code, creditHours and title
    public Course(String code, int creditHours, String name) {
        // assigns received values to their attributes
        this.code = code;
        this.creditHours = creditHours;
        this.name = name;
        
    }
    
}
