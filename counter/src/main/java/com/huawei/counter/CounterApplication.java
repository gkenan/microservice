package com.huawei.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;

@SpringBootApplication
@EnableServiceComb
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
		
		testHello();
	}

	private static void testHello(){
		HelloConsumer helloConsumer = new HelloConsumer();
		
		System.err.println("调用测试： " + helloConsumer.invokeHello());
	}
}
