package com.github.xychq8.sbtest.controller;

import com.github.xychq8.sbtest.entity.StudentEntity;
import com.github.xychq8.sbtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhangxu on 2017/10/19.
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<StudentEntity> getStudents(){
        return studentService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public StudentEntity getStudentById(@PathVariable("id") int id){
        return studentService.getById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String add(@RequestParam(value="name") String name,
                      @RequestParam(value="age") int age,
                      @RequestParam(value="sex") String sex){
        return studentService.add(name, age, sex);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public String update(@RequestParam(value="id") int id,
                         @RequestParam(value="name") String name,
                         @RequestParam(value="age") int age,
                         @RequestParam(value="sex") String sex){
        return studentService.update(id, name, age, sex);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id){
        return studentService.delete(id);
    }

    @RequestMapping(value = "/transfer")
    public void transfer(){
        studentService.transfer();
    }

}
