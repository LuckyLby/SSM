package cn.itcast.spring3.demo1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 切面类：就是切点与增强结合
 * @author Doctor
 *
 */
@Aspect
public class MyAspect {
	@Before("execution(* cn.itcast.spring3.demo1.UserDao.add(..))")
	public void before() {
		System.out.println("前置增强..."); 
	}
}
