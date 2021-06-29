package com.itlize.assignments;

import com.itlize.assignments.Entity.User;
import com.itlize.assignments.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
class OneApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
		User user = new User();
		user.setUsername("Jordan");
		user.setRole("Manager");
		user.setTitle("Developer");
		user.setLastUpdated(LocalDateTime.now());
		user.setTimeCreated(LocalDateTime.now().minusDays(3));
		user.setPassword("123456");
		User result = userRepository.save(user);
		Assert.assertNotEquals(null, result);
	}

}