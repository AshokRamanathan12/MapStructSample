package org.mapstructdemo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstructdemo.models.AddressEntity;
import org.mapstructdemo.models.DeliveryAddress;
import org.mapstructdemo.models.StudentEntity;

@Mapper
public interface DeliveryAddressMapper {
    @Mapping(source = "student.name", target = "name")
    @Mapping(source = "address.houseNo", target = "houseNumber")
    DeliveryAddress getDeliveryAddress(StudentEntity student, AddressEntity address);
}
