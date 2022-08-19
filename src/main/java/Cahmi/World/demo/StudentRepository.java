package Cahmi.World.demo;

import Cahmi.World.demo.Models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository
        extends MongoRepository<Student, String> {
    Optional<Student> findStudentByEmail(String email);
    Student findStudentByFirstName(String firstName);

}
