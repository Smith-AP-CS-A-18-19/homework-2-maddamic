/*
 * Michael Maddalon
 */

import java.awt.Rectangle;

public class Homework2 {

private String prob;

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */

public Homework2(String prob1) {
	prob = prob1;
}



	/* Write the method upperase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */

	 	public String uppercase() {
		String bigProb = prob.toUpperCase();
		return bigProb;
		}

	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */


	 	public String strip(String target) {
		target = target.replace(" ", "");
		target = target.replace(",", "");
		target = target.replace(".", "");
		target = target.replace("!", "");
	 	return target;
}

	/* Fix the errors in the method problem4
	 */


	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		r1.getWidth();
		Rectangle r2 = new Rectangle(1, 2, 3, 4);
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle(1, 2, 3, 4);
		r3.translate(1000, 1000);
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */



	public double getPerimeter(Rectangle rect) {
		double height = rect.getHeight();
		double width = rect.getWidth();
		double Perimeter = 2*height + 2*width;
		return Perimeter;



	}

}
