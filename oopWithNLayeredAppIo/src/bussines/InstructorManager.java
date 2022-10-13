package bussines;

import java.util.ArrayList;
import java.util.List;

import coreLogging.Logger;
import dataAccses.instructor.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;
	List<Instructor> instructors=new ArrayList<Instructor>();
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers,List<Instructor> instructors) {
		
		this.instructors=instructors;
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
		
	}
	

}