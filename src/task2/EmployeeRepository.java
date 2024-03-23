package task2;

import java.util.List;

public interface EmployeeRepository extends Repository<Employee>{

    List<Employee> getByDepartmentId(int id);

}
