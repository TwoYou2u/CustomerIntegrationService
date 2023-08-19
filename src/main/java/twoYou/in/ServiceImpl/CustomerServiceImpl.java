package twoYou.in.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import twoYou.in.DataBinding.CustomerBean;
import twoYou.in.Entity.Customer;
import twoYou.in.Repository.CustomerRepository;
import twoYou.in.Service.CustomerService;
import twoYou.in.Utils.CustomerUtil;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	private CustomerUtil custUtil;
	
	@Override
	public Customer saveCustomer(CustomerBean customerBean) {
		// TODO Auto-generated method stub
		
		return custRepo.save(custUtil.getCustomerDetails(customerBean));
	}

	
	
}
