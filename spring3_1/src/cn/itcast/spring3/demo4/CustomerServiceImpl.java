package cn.itcast.spring3.demo4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextInitializer;

public class CustomerServiceImpl implements CustomerService, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
	private String name;
	
	public CustomerServiceImpl() {
		super();
		System.out.println("第一步：实例化类.");
	}
	public void add() {
		System.out.println("添加客户...");
	}
	public void find() {
		System.out.println("查找客户...");
	}
	public void setName(String name) {
		System.out.println("第二部：属性注入.");
		this.name = name;
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("第三步：注入配置的类的名称" + name);
		
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("第四步：注入applicationContext" + applicationContext);
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("第六步:属性设置之后执行");
		
	}
	public void setup() {
		System.out.println("第七步：调用手动设置的初始化方法...");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("第十步：调用销毁的方法...");
		
	}
	public void teardown() {
		System.out.println("第十一步：调用手动销毁方法...");
	}
}
