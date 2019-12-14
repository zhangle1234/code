package com.company.service.impl;

import com.company.domain.Student;
import com.company.mapper.StudentMapper;
import com.company.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangle
 * @Date 2019/12/11
 * @time 9:29
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public String insertStudent(Student student) {

        String result = "fail";
        int flag = studentMapper.insert(student);
        if(flag>0){
            result = "success";
        }
        return result;
    }

    @Override
    public List<Student> queryStudents() {

        return studentMapper.selectStudents();
    }
}
