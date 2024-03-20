package space.bum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import space.bum.model.Employee;

@Controller
public class EmployeeController {
	@PostMapping("/addEmployee")
	public String submit(@ModelAttribute("employee") Employee employee) {
		System.out.println(employee);
		return "employeeView";
	}
}