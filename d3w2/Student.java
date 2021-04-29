package d3w2;

public class Student extends User {
	
	private Course[] registeredCourses;
	
	public Student() {
		
	}

	public Student(int id, String email, String firstName,String lastName, String password,Course[] registeredCourses) {
		super();
		this.registeredCourses = registeredCourses;
	}

	public Course[] getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(Course[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

}
