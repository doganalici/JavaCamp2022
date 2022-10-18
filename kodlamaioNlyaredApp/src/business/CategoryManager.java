package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
	}
	
	public void add(Category category) throws Exception {
		Category[] categories= {new Category(1,"Java"),new Category(2,"C#")};
		for (Category category2 : categories) {
			if (category.getCategoryName()==category2.getCategoryName()) {
				throw new Exception("Kategori adı tekrarlandı");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log("Kategori kaydedildi");
		}
	}
}
