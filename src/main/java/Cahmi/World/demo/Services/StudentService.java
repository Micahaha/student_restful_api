package Cahmi.World.demo.Services;

import Cahmi.World.demo.Models.Student;
import Cahmi.World.demo.ResourceNotFound;
import Cahmi.World.demo.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    public Student getStudentByName(String name){
        if(studentRepository.findStudentByFirstName(name) == null){
            throw new ResourceNotFound();
        }

        return studentRepository.findStudentByFirstName(name);



    }

    public void createStudent(Student student)
    {
        studentRepository.save(student);
    }


}
