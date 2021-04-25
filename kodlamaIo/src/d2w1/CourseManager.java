package d2w1;

public class CourseManager {
	public void registerToCourse(Course course) {
		System.out.println(course.name + " Kursuna başarıyla kayıt oldunuz. :)");
		System.out.println("Öğretmeniniz "+ course.teacherName);
	};
	public void leaveTheCourse(Course course) {
		System.out.println(course.name + " kursundan ayrıldınız. :(");
		System.out.println(course.teacherName + " hocamıza bu yapılırmı be !...");
	};

}
