// —>Main file  --> U2A1_ReadTextFileHandleExcep.java  

package u2a1_readtextfilehandleexcep;

import java.util.Scanner;

/**
 *
 * @author donaldhughes
 */
public class U2A1_ReadTextFileHandleExcep {

    /**
     * @param args the command line arguments
     */
    //add the throws keyword to the main for Exception handling
    public static void main(String[] args) throws Exception {
        //Use the File library to create a new courses.txt file
        java.io.File dataFile = new java.io.File("courses.txt");
        //create a courses array of the course instances with values
        Course[] courses = {
            new Course("IT2249 ", 6, " Introduction to Programming with Java "),
            new Course("IT2230 ", 3, " Introduction to Database Systems"),
            new Course("IT4789 ", 3, " Mobile Cloud Computing Application Development"),};

        //Start a try/catch statement to check if the file exists
        try {
            //if the file aready exists
            if (dataFile.exists()) {
                throw new Exception(dataFile + " already exists! Data is not overwritten. \n");
            } else {
                java.io.PrintWriter write = new java.io.PrintWriter(dataFile);
                //Write All Courses to the file
                for (int i = 0; i < courses.length; i++) {
                    write.print(courses[i].code);
                    write.print(courses[i].creditHours);
                    write.println(courses[i].name);
                }
                write.close();
            }
            //what to do if the Exception is found
        } catch (Exception ex) {
            //let user know that the file already exists
            System.out.println("Exception error caught: " + ex);
        }

        try {
            //Instantiate a Scanner object using the dataFile
            Scanner input = new Scanner(dataFile);
            //Set a while loop to iterate through the values in the text
            while (input.hasNext()) {
                String code = input.next();
                int creditHours = input.nextInt();
                String name = input.nextLine();
                System.out.println("Course Code = " + code + " | Credit hours = " + creditHours + " | Course Title = " + name);
            }
            input.close();

        } catch (Exception ex2) {
            //let user know that the file already exists
            System.out.println("Exception error 2: " + ex2);
            //break the procedure
            System.exit(0);
        }
        //end of Main
    }
    //End of Class
}
