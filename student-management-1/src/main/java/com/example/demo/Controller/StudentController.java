package com.example.demo.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@RequestMapping(method = RequestMethod.GET)
	public String listStudent(Model theModel) {
		List<Student> theStudents = studentDao.getAllStudents();
		theModel.addAttribute("students", theStudents);
		return "list-students";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}
	
	@GetMapping("/showFormFindId")
	public String showFormForFind(int ID) {
		
		return "student-form-search-id";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student theStudent) {
		studentDao.createStudent(theStudent);
		return "redirect:/";
	}
	
	@GetMapping("/findStudentById")
	public String findStudentById(int id) {
		Student s = studentDao.findById(id);
		return "redirect:/";
	}
	
	@PostMapping("/updateForm")
	public String updateStudent(int ID, @ModelAttribute("student") Student theStudent) {
		studentDao.updateStudent(ID, theStudent);
		return "redirect:/";
	}
	
	
}
