package com.akm.SpringJDBCEx;

import com.akm.SpringJDBCEx.modal.Student;
import com.akm.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.*;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(10);
		s.setName("Avanish");
		s.setMarks(78);

		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(s);

//		List<Student> studentList = studentService.getStudents();
//		System.out.println(studentList);



	}

}
