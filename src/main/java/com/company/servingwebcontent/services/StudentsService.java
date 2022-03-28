package com.company.servingwebcontent.services;

import com.company.servingwebcontent.models.config.StudentDto;

import java.util.List;

public interface StudentsService {

    StudentDto addStudent(StudentDto student);
    boolean removeStudent(Long studentId);

    List<StudentDto> getAllStudents();
}
