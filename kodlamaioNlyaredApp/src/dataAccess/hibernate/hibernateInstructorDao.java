package dataAccess.hibernate;

import dataAccess.InstructorDao;
import entities.Instructor;

public class hibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritanına eklendi : "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

}
