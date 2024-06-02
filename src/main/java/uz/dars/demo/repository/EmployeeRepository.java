package uz.dars.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dars.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
