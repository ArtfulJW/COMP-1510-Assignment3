package q2;


/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TimesheetRow {
    
    /**
     * Instance Variable.
     */
    private int project;
    
    /**
     * Instance Variable.
     */
    private String workPackage;
    
    /**
     * Instance Variable.
     */
    private long hours;
    
    /**
     * Constructor.
     * @param inputProject inputed Project
     * @param inputWorkPackage inputed WorkPackage
     * @param hoursInput inputed hours
     */
    public TimesheetRow(int inputProject,
            String inputWorkPackage, int[] hoursInput) {
        this.project = inputProject;
        this.workPackage = inputWorkPackage;
        this.hours = calcWeekHours(hoursInput);
    }
    
    /**
     * Constructor.
     */
    public TimesheetRow() {
        this.project = 0;
        this.workPackage = "";
        this.hours = 0;
    }
    
    /**
     * Calculates the storage of hours into the long.
     * @param hoursInput hours Input
     * @return Long rep
     */
    public long calcWeekHours(int[] hoursInput) {
        String x = "00";
        for (int i : hoursInput) {
            x += String.valueOf(i);
        }
        
        return Long.valueOf(x);
    }
    
    /**
     * Getter method.
     * @return project
     */
    public int getProject() {
        return project;
    }
    
    /**
     * Getter method.
     * @return project
     */
    public String getWorkPackage() {
        return workPackage;
    }
    
    /**
     * Getter method.
     * @return project
     */
    public long getHours() {
        return hours;
    }
    
    /**
     * Setter Method.
     * @param input - set as project
     */
    public void setProject(int input) {
        project = input;
    }
    
    /**
     * Setter Method.
     * @param input - Sets workpackage as input
     */
    public void setWorkPackage(String input) {
        workPackage = input;
    }
    
    /**
     * Setter method.
     * @param input - Sets Hours
     */
    public void setHours(long input) {
        hours = input;
    }
    
    /**
     * Get Method.
     * @param day Day Input
     * @return Hours in float
     */
    public float getHour(int day) {
        String stringLong = String.valueOf(hours);
        String returnString;

        returnString = stringLong.substring(day, day + 1);
        float returnFloat = Float.valueOf(returnString);
        return returnFloat;
    }
    
    /**
     * Sets Hours.
     * @param day Day Input
     * @param hour Hour Input
     */
    public void setHour(int day, float hour) {
        String stringLong = String.valueOf(hours);
        String replaceLong = stringLong.substring(day, day + 1);
        stringLong.replaceFirst(replaceLong, String.valueOf((int) hour));
    }
    
    /**
     * Returns String Rep.
     * @return String Rep
     */
    public String toString() {
        String x = "Project: %d\n" 
                + "Work Package: %s\n"
                + "Hours: %d\n";
        x = String.format(x, project, workPackage, hours);
        return x;
    }
    
}
