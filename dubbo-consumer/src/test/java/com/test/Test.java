package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
		context.start();
		//再次你发现 初始化new DemoServiceImpl是不成功的，说明是使用的dubbo生效，不然可以初始化的话，就用不着dubbo
		DemoService demoService = (DemoService) context.getBean("demoService");
		System.out.println(demoService.sayHello("哈哈哈"));
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
