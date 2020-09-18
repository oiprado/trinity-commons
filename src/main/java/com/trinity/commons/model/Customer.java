package com.trinity.commons.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "identification")
    private String identification;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;
}
