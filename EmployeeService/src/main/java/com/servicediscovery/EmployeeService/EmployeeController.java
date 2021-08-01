package com.servicediscovery.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    private static Map<String, List<Employee>> employeeDb = new HashMap<String, List<Employee>>();

    static {
        List<Employee>  e = new ArrayList<>();
        e.add(new Employee("Ritesh",22,"Developer",1));
        e.add(new Employee("Ayush",25,"Devops Engineer",3));

        employeeDb.put("ABC-company",e);

        List<Employee> e1 = new ArrayList<Employee>();
        e1.add(new Employee("Raj",30,"Tester",8));
        e1.add(new Employee("James",27,"Senior Developer",6));
        employeeDb.put("PQR-company",e1);
    }

    @GetMapping("/getEmployeesForCompany/{companyName}")
    public List<Employee> getEmployees(@PathVariable String companyName){
        return employeeDb.get(companyName);
    }
}
