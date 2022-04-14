package com.kiranit.mysqlConnection.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="student11")
@Getter
@Setter
@Data
public class StudentEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="id")
    int id;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String marks;
    @Column
    String branch;
    @Column
    String address;

}
