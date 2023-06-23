package com.example.demo.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@Controller
public class CustomerController {

private final CustomerDao customerDao;
	
	

	
	public CustomerController(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@GetMapping
	public String listCustomers(Model theModel) {
		List<Customer> theCustomers = customerDao.getAllCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Customer theCustomers = new Customer();
		theModel.addAttribute("customer", theCustomers);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerDao.createCustomer(theCustomer);	
		return "redirect:/";
	}
	
	@GetMapping("/updateForm")
	public String updateCustomer(int theId, @ModelAttribute("customer") Customer theCustomer) {
		Customer customer = customerDao.findCustomer(theId);
		customerDao.updateCustomer(theCustomer);
		return "list-customers";
	}
	
	

}
