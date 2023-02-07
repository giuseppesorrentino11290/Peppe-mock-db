package co.develhope.mockdb.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Students")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;
}