package org.example.customer.Controller;

import org.example.customer.Model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class CustomerController {
	@GetMapping("/")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer", new Customer());
		return "showForm";
	}
	@RequestMapping(method = RequestMethod.POST,path = "/processForm")
	public String processForm(@ModelAttribute("customer") Customer ss, Model theModel)
	{
		theModel.addAttribute("s", ss);
		return "processForm";
	}
	
}
