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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String marks;
    @Column
    private String branch;
    @Column
    private String address;

}
