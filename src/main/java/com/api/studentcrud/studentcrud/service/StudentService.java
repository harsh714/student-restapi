package com.api.studentcrud.studentcrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.studentcrud.studentcrud.dao.StudentRepository;
import com.api.studentcrud.studentcrud.entities.Student;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    //get data of all students
    public List<Student> getAllStudents() {
        List<Student> list = (List<Student>) this.studentRepo.findAll();
        return list;
    }

    //get a single student data by id
    public Student getStudentById(int id){
        Student student = null;
        try {
            student = this.studentRepo.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    //add student data
    public void addStudent(Student stu){
        this.studentRepo.save(stu);
    }

    //remove student data
    public void removeStudentById(int sId){
        this.studentRepo.deleteById(sId);;
    }

    //update student data
    public Student updateStudentById(int sId, Student st){
        st.setId(sId);
        this.studentRepo.save(st);
        return st;
    }

}
