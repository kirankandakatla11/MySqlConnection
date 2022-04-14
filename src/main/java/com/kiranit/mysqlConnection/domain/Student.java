package com.kiranit.mysqlConnection.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    int id;
    String firstName;
    String lastName;
    String marks;
    String branch;
    String address;

}
