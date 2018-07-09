package cn.itcast.spring3.demo4;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * 增强的类
 * 使用环绕增强
 * @author Doctor
 *
 */
public class MyAroundAdvice implements org.aopalliance.intercept.MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("环绕前增强...");
		Object result = methodInvocation.proceed();//执行目标对象方法
		System.out.println("环绕后增强");
		return result;
	}
	

}
