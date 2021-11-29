package q1;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestCourse {
    
    /**
     * Instance Variable.
     */
    public static final int FIFTY = 50;
    
    /**
     * Instance Variable.
     */
    public static final int SIXTY = 60;
    
    /**
     * Instance Variable.
     */
    public static final int SEVENTY = 70;
    
    /**
     * Instance Variable.
     */
    public static final int EIGHTY = 80;
    
    /**
     * This is the main method (entry point) that gets called by the JVM.
     * Driver class.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!!!
        System.out.println("Question one was called and ran sucessfully.");
        
        Address school = new Address("school Street",
                "school City", "school State", "school Code");
        Address home = new Address("Home St", 
                "home city", "home state", "home code");
        Student studentOne = new Student("Jay", "Wang", home, 
                school, SIXTY, SEVENTY, EIGHTY);
        Student studentTwo = new Student("Bob", "Man", home, 
                school, FIFTY, SIXTY, SEVENTY);
        
        Course courseOne = new Course("COMP 1113");
        
        courseOne.addStudent(studentOne, studentTwo);
        
        courseOne.average();
        
        courseOne.role();
        
        
    }

}
