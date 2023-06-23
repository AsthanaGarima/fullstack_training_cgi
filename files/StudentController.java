package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Controller
public class StudentController {

	
	private final StudentDao studentDao;

	public StudentController(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	@GetMapping
	public String listCustomers(Model theModel) {
		List<Student> theStudents = studentDao.getAllStudents();
		theModel.addAttribute("students", theStudents);
		return "list-students";
	}
//	@GetMapping("/showForm")
//	public String showFormForAdd(Model theModel) {
//		Student theStudent = new Student();
//		theModel.addAttribute("student", theStudent);
//		return "student-form";
//	}
	
	
}
