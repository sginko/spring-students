package pl.ginko.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ginko.springstudents.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String emeil); // how it work?
}
