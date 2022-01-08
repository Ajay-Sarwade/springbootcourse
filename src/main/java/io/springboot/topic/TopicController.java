package io.springboot.topic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
   
	@Autowired
	private TopicService topicservice;
	
	
	@RequestMapping("/topic")
	public List<Topic> gettopics(){
		return topicservice.gettopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic gettopic(@PathVariable int id){
		return topicservice.getTopicId(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public int addtopic(@RequestBody Topic newtopic){
		int i= topicservice.addtopic(newtopic);
		 return i;
	}
}


