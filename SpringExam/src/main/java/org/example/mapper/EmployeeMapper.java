package org.example.mapper;
import com.SpringExam.dto.EmployeeDto;
import com.SpringExam.entity.Employee;
import org.springframework.beans.BeanUtils;
public class EmployeeMapper {
    public static EmployeeDto entityToDto(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        BeanUtils.copyProperties(employee, dto);
        return dto;
    }

    public static Employee dtoToEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(dto, employee);
        return employee;
    }
}