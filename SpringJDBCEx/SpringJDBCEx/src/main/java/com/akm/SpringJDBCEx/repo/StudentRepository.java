package com.akm.SpringJDBCEx.repo;

import com.akm.SpringJDBCEx.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student)
    {
        String sql = "insert into student (rollno,name,marks) values(?,?,?)";

        int rows = jdbcTemplate.update(sql,student.getRollNo(),student.getName(),student.getMarks());
        System.out.println(rows + " affected!");
    }

    public List<Student> findAll() {

        String sql = "SELECT * FROM student";

        /*RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
        return jdbcTemplate.query(sql,mapper);*/

        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Student s = new Student();
            s.setRollNo(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }
}
