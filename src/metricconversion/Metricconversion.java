/*
 *Vilmos Feher
 *March 2019
 *This program will prompt the user to enter a number and then choose what unit
 *they would like to convert that number to
 */

package metricconversion;
import javax.swing.JOptionPane;

/**
 *
 * @author vifeh1685
 */
public class Metricconversion {

    public static double inchesToCentimetres(double x){
    return(x);
    }
    
    public static double feetToCentimetres(double x){
    return(x);    
    }
    
    public static double yardsToMeters(double x){
    return(x);    
    }
    
    public static double milesToKilometres(double x){
    return(x);    
    }
    
    public static double centimetresToInches(double x){
    return(x);    
    }
    
    public static double centimetresToFeet(double x){
    return(x);    
    }
    
    public static double metersToYards(double x){
    return(x);    
    }
    
    public static double kilometresToMiles(double x){
    return(x);    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println(" 1.- Inches to Centimetres \n 2.- Feet to Centimetres \n 3.- Yards to Meters \n "
             + "4.- Miles to Kilometres \n 5.- Centimetres to Inches \n 6.- Centimetres to Feet \n"
             + " 7.- Meters to Yards \n 8.- Kilometres to Miles ");
     String input = JOptionPane.showInputDialog("Enter the number of the method you want: ");
     String input2 = JOptionPane.showInputDialog("Enter the value you wish to convert");
     double x = 0;
     if(input.equals(1)){
        inchesToCentimetres(x);
     }
     else if(input.equals(2)){
        feetToCentimetres(x); 
     }
     else if(input.equals(3)){
         yardsToMeters(x);
     }
     else if(input.equals(4)){
         milesToKilometres(x);
     }
     else if(input.equals(5)){
         centimetresToInches(x);
     }
     else if(input.equals(6)){
         centimetresToFeet(x);
     }
     else if(input.equals(7)){
         metersToYards(x);
     }
     else if(input.equals(8)){
         kilometresToMiles(x);
     }
     else{
         System.out.println("Error");
     }     
  } 
}
