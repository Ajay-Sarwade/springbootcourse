package io.springboot.topic;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topic= new ArrayList<>( Arrays.asList(
			new Topic(1,"java"),
			new Topic(2,"spring"),
			new Topic(3,"spring-boot")
	));
	
	public List<Topic> gettopics()
	{
		return topic;
	}
	
	public Topic getTopicId(int id)
	{
		return topic.stream().filter(t -> t.id==id).findFirst().get();
	}
	
	public int addtopic(Topic newtopic)
	{
		topic.add(newtopic);
		return 20000;
	}
}
