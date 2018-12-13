package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicDao topicDao;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicDao.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return topicDao.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicDao.add();
		topicDao.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicDao.save(topic);
	}

	public void deleteTopic(String id) {
		topicDao.deleteById(id);
	}
}
