package com.servicediscovery.CompanyService;

import java.util.List;

public class CompanyDetail {
    String companyName;
    List<Employee> employees;

    public CompanyDetail(String companyName, List<Employee> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
