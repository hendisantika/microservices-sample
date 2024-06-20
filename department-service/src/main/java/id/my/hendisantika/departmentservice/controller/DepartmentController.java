package id.my.hendisantika.departmentservice.controller;

import id.my.hendisantika.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
}
