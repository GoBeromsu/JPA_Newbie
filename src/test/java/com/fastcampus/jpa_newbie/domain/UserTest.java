package com.fastcampus.jpa_newbie.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UserTest {
	@Test
	void test() {
	User user = new User();
	user.setEmail("martian@naver.com");
	user.setName("martian");
	System.out.println(">>> " + user);
	}
}