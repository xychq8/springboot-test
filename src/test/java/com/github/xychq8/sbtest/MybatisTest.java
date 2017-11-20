package com.github.xychq8.sbtest;

import com.github.xychq8.sbtest.entity.StudentEntity;
import com.github.xychq8.sbtest.dao.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MybatisTest {

	@Autowired
	private StudentMapper studentMapper;

	@Test
	public void testQuery() throws Exception {
		List<StudentEntity> users = studentMapper.getAll();
		System.out.println(users.toString());
	}

}
