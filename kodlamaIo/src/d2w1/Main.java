package d2w1;
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Programlamaya giri� i�in temel kurs","Python,C#,Java gibi t�m programlama dilleri i�in temel programlama mant���","Engin DEM�ROG");
		Course course2 = new Course(2,"Yaz�l�m geli�tirici yeti�tirme kamp�(C# + Angular)","2 ay s�recek kamp�m�z�n takip,d�k�man ve duyurular�n� buradan yapaca��z","Engin DEM�ROG");
		Course course3 = new Course(3,"Yaz�l�m geli�tirici yeti�tirme kamp�(Java + React)","2 ay s�recek kamp�m�z�n takip,d�k�man ve duyurular�n� buradan yapaca��z","Engin DEM�ROG");
		
		
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
