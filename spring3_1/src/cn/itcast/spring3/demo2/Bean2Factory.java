package cn.itcast.spring3.demo2;

/**
 * Bean2的静态工厂
 * @author Doctor
 *
 */
public class Bean2Factory {
	public static Bean2 getBean2() {
		
		return new Bean2();
	}
}
