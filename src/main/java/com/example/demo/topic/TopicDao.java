package com.example.demo.topic;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicDao extends MongoRepository<Topic, String> {

	public default void add() {
		System.out.println("This is example");
	}
}
