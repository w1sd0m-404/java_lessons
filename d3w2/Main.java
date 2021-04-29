package d3w2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setFirstName("Mahmut");
		user1.setLastName("Özel");
		user1.setId(1);
		user1.setEmail("user1@gmail.com");
		user1.setPassword("user1passwd");
		System.out.println(user1.getFirstName());
		
		UserManager userManager = new UserManager();
		userManager.userAdd(user1);
		userManager.login(user1);
		
			
		Course course1 = new Course(5, "Java", "' aylık Java&React eğitimi",0);
		Course[] courses = {course1};
		System.out.println(course1.getCourseName() +" "+ course1.getPrice() + " TL");
		
		//Student student1 = new Student(12, "st1@gmail.com", "Hacı Mahmut", "Genel", "sifremsensin29", courses);
		Student student2 = new Student();
		student2.setFirstName("Hazal");
		student2.setLastName("Kaya");
		student2.setId(4);
		student2.setEmail("std2@gmail.com");
		student2.setPassword("instructor1passwd");
		student2.setRegisteredCourses(courses);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerToCourse(course1, student2);
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setId(19);
		instructor1.setEmail("instructor1@gmail.com");
		instructor1.setPassword("instructor1passwd");
		instructor1.setBiography("Hayatı zor ve yoğun ama kendi neşeli ve eğlenceli.");
		instructor1.setSocialMedias("insta: @engindemirog");
		instructor1.setCourses("C#,Java");
		System.out.println("Kral hoca " + instructor1.getFirstName() +" "+ instructor1.getLastName() +" | "+ instructor1.getSocialMedias());
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(course1, instructor1);
		
	}

}
