package bussines;

import java.util.ArrayList;
import java.util.List;

import coreLogging.Logger;
import dataAccses.CategoryDao;
import entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	List<Category> categories = new ArrayList<Category>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categories = categories;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category newCategory) throws Exception {

		for (Category category : categories) {

			if (newCategory.getCategoryName() == category.getCategoryName()) {

				throw new Exception("Ayný ürün bir daha girilemez");

			}
		}

		categories.add(newCategory);
		categoryDao.add(newCategory); // hangi veri tabanı ile eklendiiðini
		for (Logger logger : loggers) {

			logger.log(newCategory.getCategoryName()); // loglama görevini
		}

	}

}