package cn.itcast.spring3.demo5;

public class Car {
	private String name;
	private Double price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, Double price) {
		super();
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	
}
