package com.hs.hsblog;

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

}
