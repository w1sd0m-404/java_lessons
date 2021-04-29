package d3w2;

public class StudentManager {

	public void registerToCourse(Course course,Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " isimli öğrenci başarıyla " + course.getCourseName() + " kursuna kaydoldu");
	}
	
	public void exitToCourse(Course course,Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " isimli öğrenci " + course.getCourseName() + " kursunu terketti.");
	}
}
