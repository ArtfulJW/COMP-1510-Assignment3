package q2;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;


/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Timesheet {
    
    /**
     * Instance Variable.
     */
    private String empNum;
    
    /**
     * Instance Variable. Must be Friday
     */
    private DayOfWeek endWeek;
    
    /**
     * Instance Variable.
     */
    private List<TimesheetRow> details;
    
    /**
     * Constructor.
     */
    public Timesheet() {
        this.empNum = "";
        this.endWeek = null;
        this.details = new ArrayList<TimesheetRow>();
    }
    
    /**
     * Constructor.
     * @param inputEmpNum Employee Num
     * @param inputEndWeek EndWeek
     */
    public Timesheet(String inputEmpNum, DayOfWeek inputEndWeek) {
        System.out.println("AHHHH");
        this.empNum = inputEmpNum;
        this.endWeek = inputEndWeek;
        this.details = new ArrayList<TimesheetRow>();
    }
    
    /**
     * Getter Method.
     * @return - Employee Number
     */
    public String getEmployeeNum() {
        return empNum;
    }
    
    /**
     * Getter Method.
     * @return - endWeek
     */
    public DayOfWeek getEndWeek() {
        return endWeek;
    }
    
    /**
     * Getter Method.
     * @return details
     */
    public List<TimesheetRow> getDetails() {
        return details;
    }
    
    /**
     * Setter Method.
     * @param input Employee Num Input
     */
    public void setEmployeeNum(String input) {
        empNum = input;
    }
    
    /**
     * Setter Method.
     * @param time Sets endWeek to Time
     * @throws Exception Exception if time is not FRIDAY
     */
    public void setEndDate(LocalDate time) throws Exception {
        if (time.getDayOfWeek() != DayOfWeek.FRIDAY) {
            throw new Exception();
        } else {
            endWeek = time.getDayOfWeek();
        }
    }
    
    /**
     * Adds to List 'details'.
     * @param input Row to be added.
     */
    public void addRow(TimesheetRow input) {
        details.add(input);
    }
    
    /**
     * Returns String Rep.
     * @return String Rep
     */
    public String toString() {
        String y = "";
        for (TimesheetRow i : details) {
            y += i.getProject() 
                    + " | " + i.getWorkPackage() 
                    + " | " + i.getHours()
                    + "\n";
        }
        String x = "Employee Number: %s\n";
        x = String.format(x, empNum);
        x += "End Week: " + endWeek + "\n";
        x += y;
        return x;
    }
    
    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //replace next line with your code:
        System.out.println("Question two was called and ran sucessfully.");
        
        Timesheet one = new Timesheet("125623", DayOfWeek.FRIDAY);
        TimesheetRow two = new TimesheetRow();
        TimesheetRow three = new TimesheetRow();
        TimesheetRow four = new TimesheetRow();
        
        one.addRow(two);
        one.addRow(three);
        one.addRow(four);
        
        System.out.print(one.toString());
        
    }

}
