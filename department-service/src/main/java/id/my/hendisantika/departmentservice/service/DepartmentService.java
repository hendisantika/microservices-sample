package id.my.hendisantika.departmentservice.service;

import id.my.hendisantika.departmentservice.dto.DepartmentDto;
import id.my.hendisantika.departmentservice.entity.Department;
import id.my.hendisantika.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : microservices-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/20/24
 * Time: 09:44
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    private final ModelMapper modelMapper;

    public DepartmentDto savDepartment(DepartmentDto departmentDto) {
        Department department = modelMapper.map(departmentDto, Department.class);
        // Save Department
        department = departmentRepository.save(department);

        return departmentDto;
    }
}
