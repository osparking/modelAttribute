package space.bum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import space.bum.model.Employee;

@Controller
public class EmployeeController {
  @GetMapping("/employeeInfo")
  public String getEmployeeInfoForm() {
    return "employeeInfo";
  }

  @PostMapping("/addEmployee")
  public String submit(@ModelAttribute("employee") Employee employee,
      Model model) {
    System.out.println(employee);
    model.addAttribute("id", "0" + employee.getId());
    model.addAttribute("name", employee.getName() + "씨");
    model.addAttribute("empInfo", employee.toString());
    return "employeeInfo";
  }
}
