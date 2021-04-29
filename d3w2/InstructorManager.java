package d3w2;

public class InstructorManager {
	
	public void addCourse(Course course,Instructor instructor) {
		System.out.println(instructor.getFirstName() + instructor.getLastName() +" hoca " + course.getCourseName() + " adlý kursu ekledi. <3");
	}
	
	public void addCourseMultiple(Course[] courses,Instructor instructor) {
		for(Course course:courses) {
			addCourse(course,instructor);
			System.out.println("Kurslar eklendi.");
		}
	}
	
	public void deleteCourse(Course course,Instructor instructor) {
		System.out.println(instructor.getFirstName() + instructor.getLastName() +" hoca " + course.getCourseName() + " adlý kursu kaldýrdý. :(");
	}

}
