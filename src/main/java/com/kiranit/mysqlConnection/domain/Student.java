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
   private int id;
   private String firstName;
   private String lastName;
   private String marks;
   private String branch;
   private String address;

}
