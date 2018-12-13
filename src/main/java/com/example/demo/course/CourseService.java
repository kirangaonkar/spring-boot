package com.example.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseDao courseDao;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseDao.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseDao.findById(id).get();
	}

	public void addCourse(Course course) {
		courseDao.save(course);
	}

	public void updateCourse( Course course) {
		courseDao.save(course);
	}

	public void deleteCourse(String id) {
		courseDao.deleteById(id);
	}
}
