package d3w2;

public class Instructor extends User {
	private String biography;
	private String socialMedias;
	private String courses;
	private int numberOfStudents;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String email, String userName, String password,String biography, String socialMedias, String courses) {
		super();
		this.biography = biography;
		this.socialMedias = socialMedias;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getSocialMedias() {
		return socialMedias;
	}

	public void setSocialMedias(String socialMedias) {
		this.socialMedias = socialMedias;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

}
