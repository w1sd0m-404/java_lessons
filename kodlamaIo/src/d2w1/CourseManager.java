package d2w1;

public class CourseManager {
	public void registerToCourse(Course course) {
		System.out.println(course.name + " Kursuna ba�ar�yla kay�t oldunuz. :)");
		System.out.println("��retmeniniz "+ course.teacherName);
	};
	public void leaveTheCourse(Course course) {
		System.out.println(course.name + " kursundan ayr�ld�n�z. :(");
		System.out.println(course.teacherName + " hocam�za bu yap�l�rm� be !...");
	};

}
