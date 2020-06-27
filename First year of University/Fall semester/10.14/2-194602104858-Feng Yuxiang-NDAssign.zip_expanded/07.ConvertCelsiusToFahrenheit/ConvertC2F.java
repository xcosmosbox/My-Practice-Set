/**
 *This program can Convert Celsius to Fahrenheit
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/25
 * @version 1.0
 */ 
public class ConvertC2F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Read user input
		java.util.Scanner temperature = new java.util.Scanner(System.in);
		System.out.print("Enter a temperature in Celsius: ");
		
		//Defining variables
		double Celsius = temperature.nextDouble();
		double Fahrenheit = ((9.0/5.0)*Celsius)+ 32.0;
		
		System.out.println(Celsius+" Celsius is "+Fahrenheit+" Fahrenheit");
		
		
		
		

	}

}
