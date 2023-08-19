package twoYou.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import twoYou.in.DataBinding.CustomerBean;
import twoYou.in.Entity.Customer;
import twoYou.in.Service.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {
	 //gyuuygh67
	@Autowired
	private CustomerService custService;
	
	@GetMapping("/welcome")
	public String welcome() {
		return"WelcomeTwoYou";
	}
	
	@PostMapping("/customerSave")  
	public String saveCustomer(@ModelAttribute CustomerBean customerBean) {
		Customer customer=custService.saveCustomer(customerBean);
		
		return "Customer";
	}


}
