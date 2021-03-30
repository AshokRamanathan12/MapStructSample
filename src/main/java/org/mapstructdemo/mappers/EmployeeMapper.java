package org.mapstructdemo.mappers;

import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstructdemo.models.Employee;
import org.mapstructdemo.models.EmployeeDto;

@Mapper
public interface EmployeeMapper {

    @Mapping(source = "employeeName", target = "name")
    Employee toEmployee(EmployeeDto employeeDto);

    @InheritInverseConfiguration
    EmployeeDto fromEmployee(Employee employee);
}
