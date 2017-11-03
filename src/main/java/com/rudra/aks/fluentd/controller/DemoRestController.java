package com.rudra.aks.fluentd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rudra.aks.fluentd.logger.DemoLogger;

@RestController
public class DemoRestController {

	//static Logger logger = (Logger) LoggerFactory.getLogger(DemoRestController.class);
	private static DemoLogger logger = new DemoLogger(DemoRestController.class);
	
	@RequestMapping("/")
	public String testRest() {
		logger.setCtxString("Demo Context");
		logger.info("Start : " + getClass().getName() + " : testRest()");
		return "hello fluentd";
	}
}
