package SchoolManagementSystem;

/**
 * 
 * @author Justin Pope
 * Created on 2021-05-03
 *
 */
public class Teacher {
	private String name;
	private int ID;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Creates a teacher using initialized values
	 * @param name - name of the teacher
	 * @param ID - ID of the teacher
	 * @param salary - salary of the teacher
	 */
	public Teacher(String name, int ID, int salary) {
		setName(name);
		setID(ID);
		setSalary(salary);
		salaryEarned = 0;
	}

	/**
	 * gets the name of a teacher
	 * @return the name of a teacher
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * updates the name of a teacher
	 * @param name - the new name of a teacher
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * gets the ID of a teacher
	 * @return the ID of a teacher
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * Updates the ID of a teacher
	 * @param iD - the new ID of a teacher
	 */
	public void setID(int iD) {
		this.ID = iD;
	}
	
	/**
	 * Gets the salary of a teacher
	 * @return the salary of a teacher
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * updates a teachers salary
	 * @param salary - new salary of a teacher
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	} 
	
	/**
	 * Updates a teachers total salary earned and updates a schools total money spent
	 * @param salary
	 */
	public void receieveSalary(int salary) {
		this.salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	/**
	 * Overrides the toString function for objects of type Teacher
	 */
	@Override
	public String toString() {
		return ("Teacher: " + name + " Total Salary Earned: $" + salaryEarned);
	}
	
}
