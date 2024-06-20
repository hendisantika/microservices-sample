package id.my.hendisantika.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : microservices-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/20/24
 * Time: 09:35
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RefreshScope
@RequestMapping("/api/employees")
public class MyMessageController {

    @Value("${spring.boot.message}")
    private String $message;

    @GetMapping("/user/message")
    public String message() {
        return $message;
    }
}
