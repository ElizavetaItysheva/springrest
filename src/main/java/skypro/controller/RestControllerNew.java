package skypro.controller;

import org.springframework.web.bind.annotation.*;
import skypro.entity.Employee;
import skypro.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/skypro")
public class RestControllerNew {
    private final EmployeeService employeeService;

    public RestControllerNew( EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

@GetMapping("/employees")
    public List<Employee> getAllEmployees(){
return employeeService.getAllEmployees();
    }

@GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
}
@PostMapping("/employees")
public void addEmployee(@RequestBody Employee employee){
employeeService.addEmployee(employee);
}
@PutMapping("/employees")
public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
}
@DeleteMapping("/employees/{id}")
public void deleteEmployee(@PathVariable int id){
employeeService.deleteEmployee(id);
}
}
