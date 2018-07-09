package cn.itcast.spring3.demo1.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import cn.itcast.spring3.demo1.HelloServiceImpl;
import cn.itcast.spring3.demo1.IHelloService;

public class SpringTest1 {
	
//	@Test
//	//传统方式
//	public void demo1() {
//		//造成程序紧密耦合
//		IHelloService helloService = new HelloServiceImpl();
//		helloService.sayHello();
//	}
	
	@Test
	//spring开发
	public void demo2() {
		//创建一个工厂类
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/applicationContext.xml");
		IHelloService helloService = (IHelloService)applicationContext.getBean("userService");
		helloService.sayHello();
	}
//	@Test
//	//加载磁盘路径下的配置文件
//	public void demo3() {
//		//创建一个工厂类
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/applicationContext.xml");
//		IHelloService helloService = (IHelloService)applicationContext.getBean("userService");
//		helloService.sayHello();
//	}
//	@SuppressWarnings("deprecation")
//	@Test
//	public void demo4() {
//		BeanFactory beanFacotory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		IHelloService helloService = (IHelloService)beanFacotory.getBean("userService");
//		helloService.sayHello();
//	}
}
  