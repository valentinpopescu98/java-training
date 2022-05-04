package com.valentinpopescu98.webapp.student;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('READ')")
    public Student getStudent(@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('READ')")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('WRITE')")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('WRITE')")
    public String removeStudent(@PathVariable("studentId") Long studentId) {
        return studentService.removeStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('WRITE')")
    public Student updateStudent(@PathVariable("studentId") Long studentId,
                              @RequestBody Student student) {
        return studentService.updateStudent(studentId, student);
    }
}
