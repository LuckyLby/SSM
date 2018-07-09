package cn.itcast.spring3.demo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 注解的方式装配Bean
 * @author Doctor
 *
 */
@Service(value="userService")
@Scope(value="prototype")
public class UserService {
	@Value(value="itcast")
	private String info;
	
//	@Autowired
//	@Qualifier("userDao")
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void sayHello() {
		System.out.println("Hello Spring Annotation " + info);
	}
	
	
	@Override
	public String toString() {
		return "UserService [info=" + info + ", userDao=" + userDao + "]";
	}

	@PostConstruct
	public void setup() {
		System.out.println("初始化...");
	}
	
	@PreDestroy 
	public void teardown() {
		System.out.println("销毁...");	
	}
}
  