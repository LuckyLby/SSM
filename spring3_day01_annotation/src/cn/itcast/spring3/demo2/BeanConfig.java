package cn.itcast.spring3.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean(name="car")
	public Car showCar() {
		Car car = new Car();
		car.setName("越野");
		car.setPrice(86783d);
		return car;
	}
	@Bean(name="product")
	public Product initProduct() {
		Product product = new Product();
		product.setName("空调");
		product.setPrice(52787d);
		return product;
	}
}
