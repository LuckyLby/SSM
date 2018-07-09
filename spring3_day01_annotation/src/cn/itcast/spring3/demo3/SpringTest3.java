package cn.itcast.spring3.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest3 {
	@Test
	public void demo3() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/src/cn/itcast/spring3/demo3/applicationContext2.xml");
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		System.out.println(customerService);
	}
}
