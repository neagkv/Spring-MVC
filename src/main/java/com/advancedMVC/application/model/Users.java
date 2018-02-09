package com.advancedMVC.application.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Kevin Neag
 */
@Entity
@Table(name = "Users")
public class Users {


    @Repository("userRepository")
    public interface UserRepository extends JpaRepository<Users, Long> {
        Users findByEmail(String email);

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "email")
    @Email(message = "*Enter Your Email Address")
    @NotEmpty(message = "*Enter Your Email Address")
    private String email;

    @Column(name = "password")
    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotEmpty(message = "*Please provide your password")
    @org.springframework.data.annotation.Transient
    private String password;

    @Column(name = "firstname")
    @NotEmpty(message = "*Please enter your first name")
    private String firstname;

    @Column(name = "lastname")
    @NotEmpty(message = "*Please enter your last name")
    private String lastname;

    @Column(name = "active")
    private int active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}

