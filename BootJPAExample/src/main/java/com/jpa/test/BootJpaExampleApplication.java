package com.jpa.test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootJp aExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= (ApplicationContext) SpringApplication.run(BootJpaExampleApplication.class, args);
		UserRepository userRepository=((BeanFactory) context).getBean(UserRepository.class);
		User user=new User();
		user.setName("Sagar Kumar");
		user.setCity("Giridih");
		
		User user1=userRepository.save(user);
		System.out.println(user1);
		
		
	}

}
