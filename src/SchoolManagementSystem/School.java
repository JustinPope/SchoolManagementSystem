package SchoolManagementSystem;
import java.util.List;

/**
 * 
 * @author Justin Pope
 * Created on 2021-05-03
 *
 */
public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * Creates a new school with initialized values
	 * @param teachers - List of teachers in a school
	 * @param students - List of students in a school
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
		
	}

	/**
	 * gets the list of teachers in a school
	 * @return the list of teachers in a school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * adds one teacher to a school
	 * @param teacher - the teacher being added to the school
	 */
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	/**
	 * gets the list of students in a school
	 * @return the list of students in a school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * adds one student to a school
	 * @param student - the student being added to the school
	 */
	public void addStudents(Student student) {
		this.students.add(student);
	}

	/**
	 * gets the total money earned by the school
	 * @return the total money earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * adds a value to the total money earned by the school
	 * @param moneyEarned - the value being added to the total money earned
	 */
	public static void addTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	/**
	 * gets the total money spent by a school
	 * @return the total money spent by a school
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * updates the total money earned by a school by the money being spent
	 * @param moneySpent - money spent on the wage(s)
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
	
}
	