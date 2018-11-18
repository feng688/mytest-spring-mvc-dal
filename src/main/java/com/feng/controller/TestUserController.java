package com.feng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feng.model.User;
import com.feng.service.TestDalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author fengqi
 *
 */
@Controller
public class TestUserController {
	final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	TestDalService testDalService;

	@RequestMapping(value = "/add")
	public String testUser(String username, String userage, String userdiscription) {
		User user = new User();
		user.setName(username);
		user.setAge(userage);
		user.setDiscription(userdiscription);
		Long id = testDalService.insert(user);
		System.out.println(id);
		return "user";
	}

	@RequestMapping(value = "/list")
	public String sayHello(ModelMap modelMap) {
		System.out.println("hello");
		modelMap.put("msg", "Hello!");
		return "list";
	}
}
