package q1;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Student {
    
    /**
     * Instance Variable.
     */
    public static final int THREE = 3;
    
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /**
     *  Array of test scores.
     */
    private int[] testScoresArray;

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param testScores - variable length array.
     */
    public Student(String first, String last, 
            Address home, Address school, int... testScores) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        
        // Point to same memory address.
        this.testScoresArray = testScores;
    }
    
    /**
     * Zero-Parameter Constructor.
     */
    public Student() {
        //firstName = "";
        //lastName = "";
        //homeAddress = "";
        //schoolAddress = "";
        this.testScoresArray = new int[] {0, 0, 0};
    }
    
    /**
     * Setter Method.
     * @param testNumber - Test Identifier.
     * @param testScore - Mark achieved.
     */
    public void setTestScores(int testNumber, int testScore) {
        testScoresArray[testNumber - 1] = testScore;
    }
    
    /**
     * Getter Method.
     * @param testNumber - Test Identifier.
     * @return - Returns marks for given testNumber;
     */
    public int getTestScores(int testNumber) {
        return testScoresArray[testNumber - 1];
    }
    
    /**
     * Calculates Average.
     * @return calculated Average.
     */
    public int average() {
        int calcAverage = 0;
        for (int x = 0; x < testScoresArray.length; x++) {
            calcAverage += testScoresArray[x];
        }
        
        calcAverage /= testScoresArray.length;
        
        return calcAverage;
    }
    
    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address: " + homeAddress + "\n";
        result += "School Address: " + schoolAddress + "\n";
        result += "Test 1: " + getTestScores(1) + "\n";
        result += "Test 2: " + getTestScores(2) + "\n";
        result += "Test 3: " + getTestScores(THREE) + "\n";
        result += "Average: " + average() + "\n";

        return result;
    }
}

