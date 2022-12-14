package com.neutrinosys.peopledbweb.biz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String email;
    private BigDecimal salary;

//    public Person(long id, String firstName, String lastName, LocalDate dob, String email, BigDecimal salary) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dob = dob;
//        this.email = email;
//        this.salary = salary;
//
//    }
}
