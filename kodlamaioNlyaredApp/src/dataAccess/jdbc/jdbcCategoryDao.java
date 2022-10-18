package dataAccess.jdbc;

import dataAccess.CategoryDao;
import entities.Category;

public class jdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritanına eklendi : "+category.getCategoryName());
		
	}

}
