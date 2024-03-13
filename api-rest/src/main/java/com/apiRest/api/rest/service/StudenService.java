package com.apiRest.api.rest.service;

import com.apiRest.api.rest.entity.Student;
import com.apiRest.api.rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenService {

    @Autowired
    private StudentRepository repo;

    public Student getStudentById(Long id){
        return repo.getById(id);
    }
    public List<Student> getStudentAll() {
        return repo.findAll();
    }

    public Student saveStudent(Student data){
        return repo.save(data);
    }

    public String deleteByid(Long id){
        repo.deleteById(id);
        return "Elemento borrado";
    }

}
