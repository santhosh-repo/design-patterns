package com.santhosh.dp.builder;

import java.time.LocalDate;

// This is our client which also works as director in builder pattern.
public class Client {

    public static void main(String...args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO userDTO = directBuild(builder, user);
        System.out.println("UserDTO: " + userDTO);
    }

    // Director method to build UserDTO
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthDay(user.getBirthDay())
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
