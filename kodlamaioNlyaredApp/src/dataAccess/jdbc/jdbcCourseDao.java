package dataAccess.jdbc;

import dataAccess.CourseDao;
import entities.Course;

public class jdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritanına eklendi : "+course.getCourseName());
		
	}

}
