package Cahmi.World.demo.Controllers;

import Cahmi.World.demo.Models.Student;
import Cahmi.World.demo.Services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> fetchAllStudents()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("/{name}")
    public Student getStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }

    @PostMapping("/create")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok().build();
    }


}
