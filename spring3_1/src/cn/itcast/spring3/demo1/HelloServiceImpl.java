package cn.itcast.spring3.demo1;

/**
 * 入门案例实现类
 * @author Doctor
 *
 */
public class HelloServiceImpl implements IHelloService {

	private String info;
	
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello Spring... "+info);
	}

}
