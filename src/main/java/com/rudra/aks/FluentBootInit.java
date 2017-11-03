package com.rudra.aks;

import com.rudra.aks.fluentd.logger.InitRunner;

//@SpringBootApplication
public class FluentBootInit {

	public static void main(String args[]) throws Exception {
		
		/*SpringApplicationBuilder builder = new SpringApplicationBuilder();
		builder.sources(FluentBootInit.class).run(args);*/

		
		//SpringApplication.run(FluentBootInit.class, args);
		
		InitRunner.run(FluentBootInit.class, args);
	}
}
