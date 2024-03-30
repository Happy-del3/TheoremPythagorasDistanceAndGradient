import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
 
public class TheoremPythagorasDistanceAndGradient {
 
    public static void main(String[] args) {
        // Declare variables
        double a, b, c, distance, x1, x2, y1, y2, m;
        
        // Instantiate --> Create the Scanner object
        Scanner input = new Scanner(System.in);
        
        // Instantiate --> Create the DecimalFormat and pass 0.00 to signal of two places
        DecimalFormat df = new DecimalFormat("0.00");
             
        // Prompt for user to enter adjacent side of right-angled triangle
        System.out.print("Please enter the adjacent side of right-angled triangle: ");
        
        // Read a double from the keyboard, and store it in a
        a = input.nextDouble();
        
        // Prompt for user to enter opposite side of right-angled triangle
        System.out.print("Please enter the opposite side of right-angled triangle: ");
                
        // Read a double from the keyboard, and store it in b
        b = input.nextDouble();
        
        // Determine the hypotenuse side by applying pythagoras theorem
        c = Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))));
        
        // Prompt for user to enter coordinate x1
        System.out.print("\nPlease enter coordinate x1: ");
        
        // Read a double from the keyboard, and store it in x1
        x1 = input.nextDouble();
        
        // Prompt for user to enter coordinate x2
        System.out.print("Please enter coordinate x2: ");
        
        // Read a double from the keyboard, and store it in x2
        x2 = input.nextDouble();
        
        // Prompt for user to enter coordinate y1
        System.out.print("Please enter coordinate y1: ");
        
        // Read a double from the keyboard, and store it in y1
        y1 = input.nextDouble();
        
        // Prompt for user to enter coordinate y2
        System.out.print("Please enter coordinate y2: ");
        
        // Read a double from the keyboard, and store it in y2
        y2 = input.nextDouble();
        
        // Determine the distance between two points (x-coordinates and y-coordinates)
        distance = Math.sqrt((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));
        
        // Determine the gradient of the slope between the points
        m = ((y2 - y1) / (x2 - x1));
        
        // Display the distance 
        System.out.println("\nThe hypotenuse side of right-angled triangle is " + df.format(c) + "\n" +
                           "The distance between the points is " + df.format(distance) + "\n" +
                           "The gradient of the slope is " + df.format(m));
        
    }
    
}
