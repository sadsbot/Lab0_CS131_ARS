/**
 * Class Description
 * 
 * @author Andrew Ross-Sermons
 * @version 1.0
 * Lab Project Name
 * Spring, 2023
 */

public class WorkingClass {
	String openMessage;
	int multiplier;
	public WorkingClass() {
		openMessage = "Hello, user!";
		multiplier = 10;
		System.out.println(openMessage);
	}
	
	public WorkingClass(String openMessage, int multiplier) {
		this.openMessage = openMessage;
		this.multiplier = multiplier;
		System.out.println(openMessage);
	}
	/**
	 * Method Description
	 *
	 * @param value
	 * return
	 */
	public int multiply(int value) {
		return(value*multiplier);
	}
	
	public String getOpenMessage() {
		return(openMessage);
	}
	
	public int getMultiplier() {
		return(multiplier);
	}
	
	public void setOpenMessage(String newMessage) {
		openMessage = newMessage;
	}
	
	public void setMultiplier(int newMultiplier) {
		multiplier = newMultiplier;
	}
}
