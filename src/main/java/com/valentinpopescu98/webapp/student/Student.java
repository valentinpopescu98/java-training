package com.valentinpopescu98.webapp.student;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "student_sequence", sequenceName = "student_sequence")
    @GeneratedValue(generator = "student_sequence", strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
