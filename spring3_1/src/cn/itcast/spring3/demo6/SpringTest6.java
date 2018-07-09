package cn.itcast.spring3.demo6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest6 {
	@Test
	public void demo1() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
		CollectionBean c1 = (CollectionBean) applicationContext.getBean("collectionBean");
		System.out.println(c1);
	}
}
