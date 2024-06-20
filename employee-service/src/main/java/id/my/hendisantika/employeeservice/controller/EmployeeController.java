package id.my.hendisantika.employeeservice.controller;

import id.my.hendisantika.employeeservice.dto.EmployeeDto;
import id.my.hendisantika.employeeservice.dto.EmployeeResponse;
import id.my.hendisantika.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : microservices-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/20/24
 * Time: 09:36
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/employees")
@RefreshScope
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    @Value("${spring.app.message}")
    String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }

    // Build Save Employee Rest API Endpoint
    @PostMapping
    public ResponseEntity<EmployeeDto> savEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savEmployee = employeeService.saveEmployee(employeeDto);

        return new ResponseEntity<>(savEmployee, HttpStatus.CREATED);
    }

    // Build Get Employee By ID Rest API
    @GetMapping("{employee-id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable("employee-id") Long id) {
        EmployeeResponse employee = employeeService.getEmployeeById(id);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
