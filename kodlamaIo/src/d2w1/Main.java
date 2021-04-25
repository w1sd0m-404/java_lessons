package d2w1;
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Programlamaya giriş için temel kurs","Python,C#,Java gibi tüm programlama dilleri için temel programlama mantığı","Engin DEMİROG");
		Course course2 = new Course(2,"Yazılım geliştirici yetiştirme kampı(C# + Angular)","2 ay sürecek kampımızın takip,döküman ve duyurularını buradan yapacağız","Engin DEMİROG");
		Course course3 = new Course(3,"Yazılım geliştirici yetiştirme kampı(Java + React)","2 ay sürecek kampımızın takip,döküman ve duyurularını buradan yapacağız","Engin DEMİROG");
		
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println("--> " + course.name);
			System.out.println("> " + course.detail);
			System.out.println("--> " + course.teacherName);
			System.out.println(" -*- -*- -*- -*- -*- -*- -*- -*- -*- -*- -*- -*- -*- -*- -*- -*-");
		};
		
		CourseManager courseManager = new CourseManager();
		courseManager.registerToCourse(course3);
		courseManager.leaveTheCourse(course3);
		
		courseManager.registerToCourse(course2);
		courseManager.leaveTheCourse(course2);
		
		courseManager.registerToCourse(course1);
		courseManager.leaveTheCourse(course1);
		
	}

}
