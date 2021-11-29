package q1;

import java.util.Arrays;

/**
 * Course(s) taken at school.
 * @author jj554
 * @version 1.0
 */
public class Course {
    
    
    /**
     * Array of Students attending this "Course".
     */
    private Student[] studentArray;
    
    /**
     * Course Name.
     */
    private String courseName;
    
    /**
     * Constructor.
     * @param inputName - Name of Course.
     */
    public Course(String inputName) {
        
        this.courseName = inputName;
        
        // Initalize Array of Length 0, will create new array later.
        this.studentArray = new Student[0];
    }
    
    /**
     * Add Student to this Course.
     * @param input - Added Student.
     */
    public void addStudent(Student... input) {
        // Copy and Add "input" into end of studentArray
        // System.out.println("Length of input: " + input.length);
        studentArray = Arrays.copyOfRange(input, 0, input.length);
        //for (Student i : studentArray) {
        //    System.out.print(i);
        //}
    }
    
    /**
     * Calculate average of Student average.
     */
    public void average() {
        int calcAverage = 0;
        
        for (int x = 0; x < studentArray.length; x++) {
            calcAverage += studentArray[x].average();
        }
        
        calcAverage /= studentArray.length;
        
        System.out.println("Course Average: " + calcAverage);
        
    }
    
    /**
     * Print all students in Course.
     */
    public void role() {
        for (Student i : studentArray) {
            System.out.print(i);
        }
    }
    
}
