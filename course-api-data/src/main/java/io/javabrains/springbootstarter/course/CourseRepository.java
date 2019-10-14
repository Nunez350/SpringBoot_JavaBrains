package io.javabrains.springbootstarter.course;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	Optional<Course> findById(String id);

	
	public List<Course> findByTopicId(String topicId);
	//public List<Course> findByName(String topicId);

	//public List<Course> findByDescription(String foo);
	//getAllTopics()
	//getTopic(String id)
	//deleteTopic(String id)
}
