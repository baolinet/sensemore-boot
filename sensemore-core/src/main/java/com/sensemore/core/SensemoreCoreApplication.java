package com.sensemore.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sensemore.agent.starter.AgentService;
import com.sensemore.sms.starter.SmsService;

// import com.sensemore.starter.CustomAgentBean;

@SpringBootApplication
public class SensemoreCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensemoreCoreApplication.class, args);
	}

	// @Autowired
	// private CustomAgentBean customAgentBean;

	@Autowired
	private SmsService smsService;

	@Autowired
	private AgentService agentService;

	// Command Line Runner
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			// customAgentBean.getInfo();

			System.out.println(smsService.say("hello sms"));
			System.out.println(agentService.call("我是大模型"));
		};
	}
}
