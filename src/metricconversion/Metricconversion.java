/*
 *Vilmos Feher
 *March 2019
 *This program will prompt the user to enter a number and then choose what unit
 *they would like to convert that number to
 */

package metricconversion;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vifeh1685
 */
public class Metricconversion {
    /**
     * Pre : Gets the value in inches
     * Post : Displays the value in centimetres 
     */
    
    public static void inchesToCentimetres(double x){
    double y = x *2.54;
    double rounded = Math.round(y * 100.00/ 100.00);
    System.out.println(rounded + " cm ");
    }
    
    /**
     * Pre : Gets the value in feet
     * Post : Displays the value in centimetres 
     */
    
    public static void feetToCentimetres(double x){
    double y = x * 30.48;
    double rounded = Math.round(y * 100.00/ 100.00);
    System.out.println(rounded + " cm ");
    }
    
    /**
     * Pre : Gets the value in yards
     * Post : Displays the value in meters 
     */
    
    public static void yardsToMeters(double x){
    double y = x / 1.094;  
    double rounded = Math.round(y * 100.00/ 100.00);
    System.out.println(rounded + " m ");
    }
    
    /**
     * Pre : Gets the value in miles
     * Post : Displays the value in kilometres 
     */
    
    public static void milesToKilometres(double x){
    double y = x * 1.609;
    double rounded = Math.round(y * 100.00/ 100.00);
    System.out.println(rounded + " km ");
    }
    
    /**
     * Pre : Gets the value in centimetres
     * Post : Displays the value in inches 
     */
    
    public static void centimetresToInches(double x){
    double y = x / 2.54; 
    double rounded = Math.round(y * 100.00/ 100.00);
    System.out.println(rounded + " inches ");
    }
    
    /**
     * Pre : Gets the value in centimetres
     * Post : Displays the value in feet 
     */
    
    public static void centimetresToFeet(double x){
    double y = x / 30.48;
    double rounded = Math.round(y * 100.00/ 100.00);
    System.out.println(rounded + " feet ");
    }
    
    /**
     * Pre : Gets the value in meters
     * Post : Displays the value in yards 
     */
    
    public static void metersToYards(double x){
    double y = x * 1.094;
    double rounded = Math.round(y * 100.00/ 100.00);
    System.out.println(rounded + " yards "); 
    }
    
    /**
     * Pre : Gets the value in kilometres
     * Post : Displays the value in miles 
     */
    
    public static void kilometresToMiles(double x){
    double y = x / 1.609;
    double rounded = Math.round(y * 100.00/ 100.00);
    System.out.println(rounded + " miles ");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
//     String input = JOptionPane.showInputDialog("Enter the number of the method you want: ");
//     String input2 = JOptionPane.showInputDialog("Enter the value you wish to convert");
//     double x = Double.parseDouble(input2);
       
       
       System.out.println("Pick one of these: \n 1.- Inches to Centimetres \n 2.- Feet to Centimetres \n 3.- Yards to Meters \n "
       + "4.- Miles to Kilometres \n 5.- Centimetres to Inches \n 6.- Centimetres to Feet \n"
       + " 7.- Meters to Yards \n 8.- Kilometres to Miles ");
       Scanner input = new Scanner(System.in);
       double input1 = input.nextDouble();
       
       System.out.println("Enter the value you wish to convert: ");
       Scanner num = new Scanner(System.in);
       double x = num.nextDouble();
       
     if(input1 == 1){
         inchesToCentimetres(x);
         
     }
     else if(input1 == 2){
        feetToCentimetres(x); 
        
     }
     else if(input1 == 3){
         yardsToMeters(x);
        
     }
     else if(input1 == 4){
         milesToKilometres(x);
         
     }
     else if(input1 == 5){
         centimetresToInches(x);
        
     }
     else if(input1 ==  6){
         centimetresToFeet(x);
         
     }
     else if(input1 == 7){
         metersToYards(x);
         
     }
     else if(input1 == 8){
         kilometresToMiles(x);
        
     }
     else{
         System.out.println("Error");
     }     
  } 

    
}
