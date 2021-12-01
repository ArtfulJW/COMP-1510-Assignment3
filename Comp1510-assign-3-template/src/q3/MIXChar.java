package q3;

import java.util.Scanner;

/**
 * MIXChar class.
 * @author super
 * @version 1.0
 */
public class MIXChar {
    
    /**
     * String Index 0.
     */
    public static final int INDEXPOSZERO = 0;
    
    /**
     * Base 56.
     */
    public static final int BASE56 = 56;
    
    /**
     * Instance Variable.
     */
    public static final int NINE = 9;
    
    /**
     * Fifth Character.
     */
    private static char c5;
    
    /**
     * Integer rep of Fifth Character.
     */
    private static int i5;
    
    /**
     * First Character.
     */
    private static int encoded;
    
    /**
     * First Character.
     */
    private static char decoded;
    
    /**
     * Constructor.
     * @param c - Input Character
     * @throws Exception - Exception for failed conversion
     */
    public MIXChar(char c) throws Exception {
        // Convert to a MIXChar, if Throw exception, return false. Else True
        c5 = c;
        isMIXChar(c5);
    }
    
    /**
     * Identifies Character.
     * @param input - Input Character
     */
    public static void identifyChar(String input) {
        c5 = input.charAt(INDEXPOSZERO);
    }
    
    /**
     * Convert Character.
     * @param input - Input variable
     * @return - Returns conversion.
     */
    public static int convertChar(char input) {
        
        // Convert to numeric value.
        i5 = (c5 - 'A') + 1;
        
        i5 = i5 * (int) Math.pow(BASE56, 0);
        
        return i5;
    }
    
    /**
     * Prints the Encoded Version.
     */
    public void printEncoded() {
        encoded = i5;
        System.out.println("Encoded: " + encoded);
    }
    
    /**
     * Returns if Char is a MIXChar.
     * @param c - Input Char
     * @return - If Char is a MIXChar
     * @throws Exception - Exception for failed conversion
     */
    public static boolean isMIXChar(char c) throws Exception {
        // Convert to a MIXChar, if Throw exception, return false. Else True
        
        // Convert to numeric value.
        i5 = (c5 - 'A') + 1;
        
        i5 = i5 * (int) Math.pow(BASE56, 0);
        
        if (i5 > NINE) {
            throw new Exception();
        } else {
            return true;
        }
    }
    
    /**
     * Return String rep.
     * @param input - MIXChar Array input
     * @return - String rep.
     */
    public static String toString(MIXChar[] input) {
        String returnString = "";
        
        for (MIXChar i : input) {
            
            int x = i.ordinal();
            
            returnString += Integer.toString(x);
            
        }
        
        return returnString;
        
    }
    
    /**
     * Returns Array of length s with converted values.
     * @param s - String input
     * @return - Returns Array of length s with converted values.
     */
    public static MIXChar[] toMIXChar(String s) {
        MIXChar[] returnValue = new MIXChar[s.length()];
        
        // Code..
        
        return returnValue;
    }
    
    /**
     * MIXChar Converter.
     * @return - Return numerical value of MIXChar
     */
    public int ordinal() {
        // Convert to numeric value.
        i5 = (c5 - 'A') + 1;
        
        i5 = i5 * (int) Math.pow(BASE56, 0);
        
        return i5;
    }
    
    /**
     * Return String Rep of Char.
     * @return - String Rep of Char.
     */
    public String toString() {
        return String.valueOf(c5);
    }
    
    /**
     * Main Method.
     * @param args unused
     */
    public static void main(String[] args) {
        
        // Scanner Object
        Scanner myScanner = new Scanner(System.in);
        
        // Prompt User Input
        System.out.println("Please input a String.");

        
    }
    
}
