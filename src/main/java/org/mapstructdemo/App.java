package org.mapstructdemo;

import org.mapstruct.factory.Mappers;
import org.mapstructdemo.mappers.DeliveryAddressMapper;
import org.mapstructdemo.models.AddressEntity;
import org.mapstructdemo.models.DeliveryAddress;
import org.mapstructdemo.models.StudentEntity;

public class App {

    public static void main(String[] args) {

        DeliveryAddressMapper deliveryAddressMapper = Mappers.getMapper(DeliveryAddressMapper.class);

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setClassVal("Class_5");
        studentEntity.setId(3);
        studentEntity.setName("John Doe");

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity("Chennai");
        addressEntity.setHouseNo(24);
        addressEntity.setState("Tamil Nadu");

        DeliveryAddress deliveryAddress = deliveryAddressMapper.getDeliveryAddress(studentEntity, addressEntity);
        System.out.println(deliveryAddress);

    }

}
