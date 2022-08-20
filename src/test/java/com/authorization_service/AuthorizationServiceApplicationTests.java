package com.authorization_service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.authorizationService.AuthorizationServiceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(
    classes = AuthorizationServiceApplication.class
   // webEnvironment = WebEnvironment.RANDOM_PORT
)
//@SpringBootTest
class AuthorizationServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
