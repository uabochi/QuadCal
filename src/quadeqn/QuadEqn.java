
package quadeqn;

import java.util.Scanner;


public class QuadEqn {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Equation format: ax^2 + bx + c\n supply the values of a,b,c\n" + " In the format:a,b,c");
    String param = new Scanner(System.in).nextLine();
    String []p_a = param.split(",");
    
    double []coeffs = new double[p_a.length];
    double a = coeffs[0];
    double b = coeffs[1];
    double c = coeffs[2];
    
    for(int i = 0; i < p_a.length; i++){
        coeffs[i] = Double.parseDouble(p_a[i]);
    }        
        
//        String input = new Scanner(System.in).nextLine();
//        String [] array = input.split(",");
//        double a = Double.parseDouble(array[0]);
//        double b = Double.parseDouble(array[1]);
//        double c = Double.parseDouble(array[2]);
        double d = b*b - 4*a*c;
        
        if(d > 0){
            double x1 = (-b + Math.pow(d, 0.5))/2*a;
            double x2 = (-b - Math.pow(d, 0.5))/2*a;
            System.out.println("The roots of the equation are: x1 = " + x1 +"," + " x2 = " + x2);      
            
        }else if(d == 0){
            double x = -b/2*a;
            System.out.println("The root of the equation: x = " + x);
            
        }else if(d < 0){
            System.out.println("The equation has no real roots");
        }
        
    }
    
}
