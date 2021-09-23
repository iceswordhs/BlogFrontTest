package com.hs.hsblog;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hs.hsblog.mapper.CategoryMapper;
import com.hs.hsblog.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@SpringBootTest
class HsblogApplicationTests {

    @Resource
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() throws SQLException {
        //Connection connection = dataSource.getConnection();
        //PreparedStatement preparedStatement = connection.prepareStatement("select * from article");
        //preparedStatement.execute();
        //ResultSet resultSet = preparedStatement.executeQuery();
        //while (resultSet.next()){
        //    System.out.println(resultSet.getString("article"));
        //}
    }

    @Autowired
    CategoryMapper categoryMapper;
    @Test
    void test1(){
        System.out.println(categoryMapper.findIsExistByCategoryName("SpringBoot"));
    }

    @Test
    void testJSON(){
        ArrayList<Student> studentLsit = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setAge(20);
        student1.setName("asdasdasd");

        studentLsit.add(student1);

        Student student2 = new Student();
        student2.setId(2);
        student2.setAge(20);
        student2.setName("aaaa:;aaa");

        studentLsit.add(student2);

        //list转json字符串
        String string = JSON.toJSON(studentLsit).toString();
        System.out.println(string);

        //json字符串转listJson格式
        JSONArray jsonArray = JSONObject.parseArray(string);

        System.out.println(jsonArray);
    }

}
