package twoYou.in.Utils;

import org.springframework.stereotype.Component;

import twoYou.in.DataBinding.CustomerBean;
import twoYou.in.Entity.Customer;

@Component
public class CustomerUtil {

	public Customer  getCustomerDetails(CustomerBean customerBean) {
		
		Customer customer=new Customer();
		customer.setCustName(customerBean.getCustName());
		customer.setCustEmail(customerBean.getCustEmail());
		customer.setCustPhoneNo(customerBean.getCustPhoneNo());
		
		return customer;
	}
}
