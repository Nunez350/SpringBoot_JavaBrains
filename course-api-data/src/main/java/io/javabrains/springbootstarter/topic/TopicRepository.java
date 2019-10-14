package io.javabrains.springbootstarter.topic;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

	Optional<Topic> findById(String id);


	

	
	//getAllTopics()
	//getTopic(String id)
	//deleteTopic(String id)
}
