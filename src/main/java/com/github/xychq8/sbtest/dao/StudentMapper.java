package com.github.xychq8.sbtest.dao;

import com.github.xychq8.sbtest.entity.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zhangxu on 2017/9/28.
 */
@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "sex", column = "sex")
    })
    List<StudentEntity> getAll();



    @Select("SELECT * FROM student WHERE id = #{id}")
    StudentEntity getById(@Param("id") int id);



    @Insert("INSERT INTO student(name, age, sex) VALUES(#{name}, #{age}, #{sex})")
    int add(@Param("name") String name, @Param("age") int age, @Param("sex") String sex);



    @Update("UPDATE student SET name = #{name}, age = #{age}, sex = #{sex} WHERE id = #{id}")
    int update(@Param("id") int id, @Param("name") String name, @Param("age") int age, @Param("sex") String sex);



    @Delete("DELETE FROM student WHERE id = #{id}")
    int delete(@Param("id") int id);

}
