package com.servicediscovery.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CompanyController {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getCompanyDetails/{companyName}")
    public CompanyDetail getCompanyDetails(@PathVariable String companyName){
        System.out.println("");
        List<Employee> response = restTemplate
                .exchange("http://employee-service/getEmployeesForCompany/{companyName}",
                HttpMethod.GET,null,new ParameterizedTypeReference<List<Employee>>() {}, companyName).getBody();

        return new CompanyDetail(companyName,response);

    }
}
