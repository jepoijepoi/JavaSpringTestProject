package com.ul.testwebproject;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ul.testwebproject.beans.Actor;
import com.ul.testwebproject.dao.ActorDAO;

public class TestMain {

	private static ApplicationContext context;

	static Logger log = Logger.getLogger(TestMain.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String attrValue = "55000000";
		String attrValue = "123456789";
		// String attrValue = "5.5E7";

		// Double x = (double) 123456789;
		// System.out.println(String.valueOf(x));
		// attrValue =
		// BigDecimal.valueOf(Double.parseDouble(attrValue)).toPlainString();
		// System.out.println(attrValue);

		context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		log.info("Hello World!");

		ActorDAO actorDAO = (ActorDAO) context.getBean("actorDAO");

		Actor actor = actorDAO.getActorById(22);
		System.out.println(actor.getFirstName() + " " + actor.getLastName());

		List<Actor> actorsList = actorDAO.getActors();
		System.out.println(actorsList.get(22).getFirstName());
	}

}
