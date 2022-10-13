package main;

import java.util.ArrayList;
import java.util.List;

import bussines.CategoryManager;
import bussines.CourseManager;
import bussines.InstructorManager;
import coreLogging.DatabaseLogger;
import coreLogging.FileLogger;
import coreLogging.Logger;
import dataAccses.CourseDao;
import dataAccses.HibernateCategoryDao;
import dataAccses.instructor.InstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		/// CATEGORY

		Logger[] loggers = { new FileLogger(), new DatabaseLogger() };

		// kategorilerimizi oluşturuyoruz
		Category category1 = new Category(1, "Spor");
		Category category2 = new Category(2, "Tarih");
		Category category3 = new Category(3, "Sinema");
		// oluşturduðumuz kategorileri categories listesine ekliyoruz
		List<Category> categories = new ArrayList<Category>();
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);

		Category category = new Category(4, "Bilgisiyar mimarileri"); // ekleyeceğimiz yeni kategorimizi oluşturuyoruz

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category);

		System.out.println("------------------------------------------------------");
		// COURSE

		// kurslarımızı oluşturuyoruz
		List<Course> courses = new ArrayList<Course>();
		Course course1 = new Course(1, "java", 1200);
		Course course2 = new Course(2, "c#", 1200);
		Course course3 = new Course(3, "c++", 1200);
		// oluşturduğumuz kursları courses listesine ekliyoruz
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);

		Course course = new Course(4, "javaScript", 2); // ekleyeceğimiz yeni kursumuzu oluşturuyoruz

		CourseManager courseManager = new CourseManager(new CourseDao(), loggers, courses);
		courseManager.add(course);

		System.out.println("------------------------------------------------------");

		// INSTRUCTOR

		List<Instructor> instructors = new ArrayList<Instructor>();
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new InstructorDao(), loggers, instructors);
		instructorManager.add(instructor);

	}

}
