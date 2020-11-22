package de.service;

import de.domain.Student;
import de.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student add(Student student) {
        return repository.save(student);
    }

    public Student update(Student student) {
        return repository.save(student);
    }

    public void delete(Student student) {
        repository.delete(student);
    }
}
