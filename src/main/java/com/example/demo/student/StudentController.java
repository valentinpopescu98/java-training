package com.example.demo.student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private static final List<Student> STUDENTS = List.of(
            new Student(1, "Gigel"),
            new Student(2, "Vasile"),
            new Student(3, "Leana"));

    @GetMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('READ')")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        return STUDENTS.stream()
                       .filter(student -> studentId.equals(student.getStudentId()))
                       .findFirst()
                       .orElseThrow(() -> new IllegalStateException("Student " + studentId + " does not exist."));
    }

    @GetMapping
    @PreAuthorize("hasAuthority('READ')")
    public List<Student> getAllStudents() {
        return STUDENTS;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('WRITE')")
    public void addStudent(@RequestBody Student student) {
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('WRITE')")
    public void removeStudent(@PathVariable("studentId") Integer studentId) {
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('WRITE')")
    public void updateStudent(@PathVariable("studentId") Integer studentId,
                              @RequestBody Student student) {
        System.out.printf("%d %s%n", studentId, student);
    }
}
