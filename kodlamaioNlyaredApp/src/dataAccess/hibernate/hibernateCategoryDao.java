package dataAccess.hibernate;

import dataAccess.CategoryDao;
import entities.Category;

public class hibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritanına eklendi : "+category.getCategoryName());
		
	}

}
