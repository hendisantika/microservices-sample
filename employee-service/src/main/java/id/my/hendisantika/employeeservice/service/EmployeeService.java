package id.my.hendisantika.employeeservice.service;

import id.my.hendisantika.employeeservice.dto.EmployeeDto;
import id.my.hendisantika.employeeservice.entity.Employee;
import id.my.hendisantika.employeeservice.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created by IntelliJ IDEA.
 * Project : microservices-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/20/24
 * Time: 09:32
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    private final RestTemplate restTemplate;

    private final WebClient webClient;

    private final APIClient apiClient;

    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        // Convert EmployeeDto to Employee Entity
        Employee employee = modelMapper.map(employeeDto, Employee.class);

        // Save Employee
        employeeRepository.save(employee);

        return employeeDto;
    }
}
