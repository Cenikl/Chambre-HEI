package com.spring.project.model;

import com.spring.project.model.enumeration.Gender;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;


    @Column(nullable = false)
    private String phone;


    @Column(nullable = false,unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "room",nullable = false)
    private Room room;
}
