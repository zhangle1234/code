package com.company.controller;

import com.company.domain.Student;
import com.company.service.StudentService;
import com.company.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author zhangle
 * @Date 2019/12/11
 * @time 9:30
 */

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Student stu){
       String result = "fail";
//      Student stu = new Student();
////
////        stu.setName(name);
////        stu.setAge(age);


        result = studentService.insertStudent(stu);
        if(result=="success"){
           result = "success";
        }


        return result;

    }



}
