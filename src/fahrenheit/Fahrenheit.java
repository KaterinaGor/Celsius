/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

import java.util.Scanner;
public class Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    double f,c;
            Scanner sc = new Scanner(System.in);
	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
            int ch = sc.nextInt();
	    switch(ch){
	    case 1:  System.out.println("Enter  Fahrenheit temperature");
                f = sc.nextDouble();
	    	c = (f-32)*5/9;
	    	System.out.println("Celsius temperature is = "+c);
		break;
	    case 2:  System.out.println("Enter  Celsius temperature");
                c = sc.nextDouble();
	    	f = ((9*c)/5)+32;
	    	System.out.println("Fahrenheit temperature is = "+f);
		break;
	    default:  System.out.println("please choose valid choice");}
    }
    
}
