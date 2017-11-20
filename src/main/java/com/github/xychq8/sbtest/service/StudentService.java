package com.github.xychq8.sbtest.service;

import com.github.xychq8.sbtest.dao.StudentMapper;
import com.github.xychq8.sbtest.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhangxu on 2017/10/18.
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<StudentEntity> getAll(){
        return studentMapper.getAll();
    }

    public StudentEntity getById(int id){
        return studentMapper.getById(id);
    }

    public String add(String name, int age, String sex){
        int resultCode = studentMapper.add(name, age, sex);

        return resultCode == 1 ? "success" : "failure'";
    }

    public String update(int id, String name, int age, String sex){
        int resultCode = studentMapper.update(id, name, age, sex);

        return resultCode == 1 ? "success" : "failure'";
    }

    public String delete(int id){
        int resultCode = studentMapper.delete(id);

        return resultCode == 1 ? "success" : "failure'";
    }

    @Transactional
    public void transfer() throws RuntimeException{
        studentMapper.add("wy", 999, "gay");
        int i=1/0;
        studentMapper.add("hhy", 1, "gay");
    }
}
