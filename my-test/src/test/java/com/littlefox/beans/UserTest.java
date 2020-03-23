package com.littlefox.beans;

import com.littlefox.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author rockychen
 * @version 1.0
 * @date 2020-03-23 19:17
 */
public class UserTest {

	@Test
	public void TestUser(){

//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//		User bean = (User) bf.getBean("user");
//		System.out.println(bean.toString());

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());

	}
}
