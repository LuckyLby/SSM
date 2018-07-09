package cn.itcast.spring3.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Bean的作用范围
 * @author Doctor
 *
 */
public class SptringTest3 {
//	@Test
//	//测试scope
//	public void demo1() {
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/applicationContext.xml");
//		Customer c1 = (Customer) applicationContext.getBean("customer");
//		System.out.println(c1);
//		
//		Customer c2 = (Customer) applicationContext.getBean("customer");
//		System.out.println(c2);
//		
//	}
	@Test
	//测试初始化和销毁方法
	//执行销毁的时候，必须手动关闭工厂，而且只对scope="singleton"有效
	public void demo2() {
		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("/applicationContext.xml");
		Product p1 = (Product) applicationContext.getBean("product");
		applicationContext.close();
	}
}
