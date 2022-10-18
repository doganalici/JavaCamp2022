package dataAccess.hibernate;

import dataAccess.CourseDao;
import entities.Course;

public class hibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritanına eklendi : "+course.getCourseName());
		
	}

}
