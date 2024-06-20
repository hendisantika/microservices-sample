package id.my.hendisantika.departmentservice.controller;

import id.my.hendisantika.departmentservice.dto.DepartmentDto;
import id.my.hendisantika.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
 * Time: 09:45
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class DepartmentController {
    private final DepartmentService departmentService;

    // Build Save Department Rest API Endpoint
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto savDepartment = departmentService.savDepartment(departmentDto);

        return new ResponseEntity<>(savDepartment, HttpStatus.CREATED);
    }
}
