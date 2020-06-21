package com.example.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
	
		creatingUser("Gabriel Fernando manuel", "Fred@gamil.com");
	List<User> users=userRepository.findAll();
	for (User user : users) {
	System.out.println(user.getName());
	System.out.println(user.getName());
	System.out.println(user.getName());
	System.out.println(user.getName());
	System.out.println(user.getName());
	}
	
	}
	
	public void creatingUser(String name, String email) {
		User user=new User();
		user.setEmail("gabrielfernad92@gmail.com");
		user.setName("Gabriel Fernando manuel");
		userRepository.save(user);
	} 

}