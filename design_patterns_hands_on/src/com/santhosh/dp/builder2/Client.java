package com.santhosh.dp.builder2;

import com.santhosh.dp.builder.Address;
import com.santhosh.dp.builder.User;
import com.santhosh.dp.builder2.UserDTO.UserDTOBuilder;

import java.time.LocalDate;

public class Client {

    public static void main(String...args) {
        User user = createUser();
        UserDTO userDTO = directBuild(UserDTO.getBuilder(), user);
        System.out.println("UserDTO::::: " + userDTO);
    }

    // Director method to build UserDTO
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthDay())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setFirstName("Santhosh");
        user.setLastName("Charugundla");
        user.setBirthDay(LocalDate.of(1995, 4, 10));

        Address address = new Address();
        address.setHouseNumber("123");
        address.setStreet("Main St");
        address.setCity("Springfield");
        address.setState("IL");
        address.setZipCode("62701");

        user.setAddress(address);

        return user;
    }
}
