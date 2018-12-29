package com.initcat;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceApplicationTests {

	@Autowired
	StringEncryptor encryptor;

	@Test
	public void contextLoads() {
	}

	@Test
	public void jasyptTest() {

		String url = encryptor.encrypt("jdbc:mysql://XXXX:3306/initcat?useUnicode=true&characterEncoding=UTF-8&useSSL=false");
		String name = encryptor.encrypt("XXXX");
		String password = encryptor.encrypt("XXXX");
		String ip = encryptor.encrypt("XXXX");
		System.out.println(url+"----------------");
		System.out.println(name+"----------------");
		System.out.println(password+"----------------");
		System.out.println(ip+"----------------");
		Assert.assertTrue(name.length() > 0);
		Assert.assertTrue(password.length() > 0);
	}

}
