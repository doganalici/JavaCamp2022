package kodlamaioNlyaredApp;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.hibernate.hibernateCategoryDao;
import dataAccess.hibernate.hibernateInstructorDao;
import dataAccess.jdbc.jdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		Category category1=new Category(3,"Php");
		CategoryManager categoryManager=new CategoryManager(new hibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		System.out.println();

		Course course1=new Course(3,"Orta Düzey Php","Ucuz",60);
		CourseManager courseManager=new CourseManager(new jdbcCourseDao(), loggers);
		courseManager.add(course1);
		System.out.println();
		
		Instructor instructor1=new Instructor(1,"Engin","Demiroğ");
		InstructorManager instructorManager=new InstructorManager(new hibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
	}

}
