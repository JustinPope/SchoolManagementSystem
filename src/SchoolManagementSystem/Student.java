package SchoolManagementSystem;

/**
 * 
 * @author Justin Pope
 * Created on 2021-05-03
 *
 */
public class Student {
	private String name;
	private int ID;
	private int year;
	private int feesPayed;
	public static final int totalFees = 50000;
	
	/**
	 * Creates a Student using initialized values
	 * @param name - Name of the student
	 * @param ID - The students ID
	 * @param year - Current year the student is in
	 */
	public Student(String name, int ID, int year) {
		this.feesPayed = 0;
		this.setID(ID);
		this.setName(name);
		this.setYear(year);
	}

	/**
	 * Gets the students name
	 * @return the students name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the students name
	 * @param name - new name of the student
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the students ID
	 * @return the students ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * updates the students ID
	 * @param iD - The students new ID
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * Gets the current year the student is in
	 * @return - the students current year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * updates the current year the student is in
	 * @param year - the students new year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * gets the fees payed by the student
	 * @return - the fees payed by the student
	 */
	public int getFeesPayed() {
		return feesPayed;
	}

	/**
	 * updates the fees payed by feesPayed, updates the schools total revenue
	 * @param feesPayed - fees payed by a student
	 */
	public void payFees(int feesPayed) {
		this.feesPayed += feesPayed;
		School.addTotalMoneyEarned(feesPayed);
	}
	
	/**
	 * returns the fees a student still needs to pay
	 * @return the fees a student still needs to pay
	 */
	public int getRemainingFees() {
		return totalFees - feesPayed;
	}
	
	/**
	 * Overrides the toString function for student type objects
	 */
	@Override
	public String toString() {
		int temp = totalFees-feesPayed;
		return ("Student: " + name + " Total Fees Payed: $" + feesPayed + " Total Fees Remaining: $" + temp);
	}
}
