package org.mapstructdemo;

import org.mapstruct.factory.Mappers;
import org.mapstructdemo.mappers.DeliveryAddressMapper;
import org.mapstructdemo.mappers.EmployeeMapper;
import org.mapstructdemo.models.*;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        /*DeliveryAddressMapper deliveryAddressMapper = Mappers.getMapper(DeliveryAddressMapper.class);

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setClassVal("Class_5");
        studentEntity.setId(3);
        studentEntity.setName("John Doe");

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity("Chennai");
        addressEntity.setHouseNo(24);
        addressEntity.setState("Tamil Nadu");

        DeliveryAddress deliveryAddress = deliveryAddressMapper.getDeliveryAddress(studentEntity, addressEntity);
        System.out.println(deliveryAddress);*/

        EmployeeMapper employeeMapper = Mappers.getMapper(EmployeeMapper.class);

        Employee employee1 = new Employee();
        employee1.setName("emp1");

        Employee teammate = new Employee();
        teammate.setName("teammate");
        teammate.setTeam(Arrays.asList(employee1));

        Employee manager = new Employee();
        manager.setName("manager");

        employee1.setReportsTo(manager);
        teammate.setReportsTo(manager);

        //Mapping
        EmployeeDto employeeDto = employeeMapper.fromEmployee(employee1);
        System.out.println(employeeDto);

    }

}
