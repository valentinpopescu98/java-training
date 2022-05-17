package com.valentinpopescu98.webapp.student;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Student {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "student_sequence", sequenceName = "student_sequence")
    @GeneratedValue(generator = "student_sequence", strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
