package com.example.demo.course;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseDao extends MongoRepository<Course, String> {

	public List<Course>findByTopicId(String topicId); 
}
