package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	 public List<Topic> getAllTopics(){
		 //TopicRepositoryから返すようにする  CrudRepositoryの仕様をフル活用
		 List<Topic> topics = new ArrayList<Topic>();
		 topicRepository.findAll()
		 .forEach(topics::add);
		 return topics;
	 }
	 
	 public Topic getTopic(String id){
		 //CrudRepositoryの仕様
		 return topicRepository.findOne(id);
	 }

	public void addTopic(Topic topic) {
		//CrudRepositoryの仕様
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic){
		//CrudRepositoryの仕様
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//CrudRepositoryの仕様
		topicRepository.delete(id);
	}
	 
}
