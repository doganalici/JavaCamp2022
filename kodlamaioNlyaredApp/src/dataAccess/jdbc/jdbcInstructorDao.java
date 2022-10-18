package dataAccess.jdbc;

import dataAccess.InstructorDao;
import entities.Instructor;

public class jdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritanına eklendi : "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

}
