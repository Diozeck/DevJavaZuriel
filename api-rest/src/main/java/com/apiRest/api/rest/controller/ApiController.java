package com.apiRest.api.rest.controller;

import com.apiRest.api.rest.entity.Student;
import com.apiRest.api.rest.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class ApiController {

    @Autowired
    private StudenService services;

    @PostMapping
    private Student saveStudent(@RequestBody Student data){
        return services.saveStudent(data);
    }

    @GetMapping("/all")
    private List<Student> getStudent(){
        return services.getStudentAll();
    }

    @GetMapping("/get/{id}")
    private Student getStudent(@PathVariable Long id){
    	Student s = new Student();
    	try {
			s = services.getStudentById(id);
		} catch (Exception e) {
			System.out.println("ApiController.getStudent()" + e);
		}
        return s;
    }

    @DeleteMapping
    private String deleteStudent(Long id){
        return services.deleteByid(id);
    }
}
