package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Course;
import com.ty.dto.Student;
import com.ty.dto.Subject;
import com.ty.dto.Teacher;

public class TestSaveCourse {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student stu = new Student();
		stu.setName("veena");
		stu.setAge(21);
		student.add(stu);

		Student stu1 = new Student();
		stu1.setName("shyam");
		stu1.setAge(18);
		student.add(stu1);

		Student stu2 = new Student();
		stu2.setName("ram");
		stu2.setAge(24);
		student.add(stu2);

		Student stu3 = new Student();
		stu3.setName("Rohan");
		stu3.setAge(20);
		student.add(stu3);

		Course c = new Course();
		c.setName("JAVA DEVELOPMENT");
		c.setCost(65000);
		c.setStudent(student);

		entityTransaction.begin();
		entityManager.persist(stu);
		entityManager.persist(stu1);
		entityManager.persist(stu2);
		entityManager.persist(stu3);
		entityManager.persist(c);
		entityTransaction.commit();

		System.out.println("----------DATA STORED----------------");
	}

}
