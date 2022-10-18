package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course[] courses = { new Course(1, "Başlangıç Java", "Ucuz", 50),
				new Course(2, "İleri Düzey C#", "Pahallı", 120) };
	
	for (Course course2 : courses) {
		if (course.getCourseName()==course2.getCourseName()) {
			throw new Exception("Kurs ismi tekrar edildi");
		}else if (course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0' dan küçük olamaz");
		}
	}
	
	courseDao.add(course);
	for (Logger logger : loggers) {
		logger.log("Kurs kaydedildi");
	}
	}
	
	

}
