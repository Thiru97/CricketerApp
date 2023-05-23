package com.simplilearn.cricket.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cricketer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @Column(name ="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name = "nationality")
    private String nationality;

}
