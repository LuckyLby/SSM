package cn.itcast.spring3.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest4 {
	@Test
	//Bean完整的生命周期
	public void demo1() {
		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
		CustomerService c1 = (CustomerService) applicationContext.getBean("customerservice");
		c1.add();
		c1.find();
		applicationContext.close();
	}
}
