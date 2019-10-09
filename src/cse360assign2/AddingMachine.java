package cse360assign2;
/**Brandon Thomas
 * CSE360 70641
 * Assignment 2
 * 
 * AddingMachine Class creates an "addingmachine"
 * math operations can be performed with this machine, such as addition and
 * subtraction,
 */
/** The AddingMachine adds and subtracts integers, and returns a history
 *  of all operations. <b>Total</b> is a private field. 
 *  It stores the total from operations performed by the AddingMachine.
 *  Additionally, the AddingMachine has a private string <b>history</b>
 *  that stores the history of all operations performed by the instance.
 */
public class AddingMachine {

	private int total;
	private String history = Integer.toString(total);
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * Return the total from the adding machine
	 * @return the current total from all mathematical operations
	 */
	public int getTotal () 
	{
		return total;
	}
	/**
	 *  add an int to the <b>AddingMachine</b>
	 * @param value The int to be added
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + Integer.toString(value);
	}
	
	/**
	 * Subtract the int from the AddingMachine
	 * @param value
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + Integer.toString(value);
	}
	
	/**
	 * Return the string representation of the AddingMachine
	 * 
	 */
	public String toString () {
		return history;
	}
	/**
	 * Clear sets <b>total</b> to 0, and also clears out the history of 
	 * operations.
	 */
	public void clear() {
		total = 0;
		history = Integer.toString(total);
	
	}
}
