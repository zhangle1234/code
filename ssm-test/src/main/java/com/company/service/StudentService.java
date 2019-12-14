package com.company.service;

import com.company.domain.Student;

import java.util.List;

/**
 * @author zhangle
 * @Date 2019/12/11
 * @time 9:28
 */
public interface StudentService {
    String insertStudent(Student student);

    List<Student> queryStudents();
}
