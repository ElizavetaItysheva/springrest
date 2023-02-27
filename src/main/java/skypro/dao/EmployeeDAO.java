package skypro.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import skypro.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllOdEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

}
