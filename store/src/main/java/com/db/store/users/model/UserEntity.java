package com.db.store.users.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "user")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="last_name")
    private String lastName;

    @Column(name="firs_name")
    private String firstName;

    @Column(name="email")
    private String email;
}
