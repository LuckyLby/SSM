package cn.itcast.spring3.demo1.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.itcast.spring3.demo2.Bean1;
import cn.itcast.spring3.demo2.Bean2;
import cn.itcast.spring3.demo2.Bean3;

/**
 * Bean的实例化的测试
 * @author Doctor
 * 
 */
public class SpringTest2 {
	@Test
	//无参构造方法的实例化
	public void demo1() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/applicationContext.xml");
		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
		System.out.println(bean1);
	}
	@Test
	//静态工厂实例化
	public void demo2() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/applicationContext.xml");
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		System.out.println(bean2);
	}
	@Test
	//静态工厂实例化
	public void demo3() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/applicationContext.xml");
		Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
		System.out.println(bean3);
	}
//	@Test
//	public void demo2() {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
//		System.out.println(bean2);
//	}
}
