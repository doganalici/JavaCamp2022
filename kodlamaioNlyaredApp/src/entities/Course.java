package entities;

public class Course {
	int id;
	String courseName;
	String courseType;
	double price;
	
	public Course() {
		
	}

	public Course(int id, String courseName, String courseType, double price) {
		
		this.id = id;
		this.courseName = courseName;
		this.courseType = courseType;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
