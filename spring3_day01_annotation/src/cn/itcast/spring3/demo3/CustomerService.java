package cn.itcast.spring3.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CustomerService {
	private CustomerDao customerDao;
	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;
	@Override
	public String toString() {
		return "CustomerService [customerDao=" + customerDao + ", orderDao=" + orderDao + "]";
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
}
