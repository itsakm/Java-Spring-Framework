package com.akm.SpringJDBCEx.repo;

import com.akm.SpringJDBCEx.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Repository
public class StudentRepository {

    private NamedParameterJdbcTemplate jdbcTemplate;

    public NamedParameterJdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student)
    {
        String sql = "INSERT INTO student VALUES(:rollno,:name,:marks);";
//        String sql = "select * from assignment where username='"+student.getRollNo()+"';";
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("rollno",student.getRollNo());
        map.put("name",student.getName());
        map.put("marks",student.getMarks());
        jdbcTemplate.execute(sql, map, new PreparedStatementCallback() {
            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException{
                return ps.executeUpdate();
            }
        });
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
