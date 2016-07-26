package com.ishowly.printer.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@RequestMapping("/")
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

        logger.info("张东杰测试");

		model.addAttribute("message", "Hello world! " + System.currentTimeMillis());
		return "hello";
	}
}