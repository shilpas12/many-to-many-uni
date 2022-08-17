package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Course;
import com.ty.dto.Student;

public class TestGetAllCourse {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Course course = entityManager.find(Course.class, 1);
		System.out.println(course.getId());
		System.out.println(course.getName());
		System.out.println(course.getCost());

		List<Student> stu = course.getStudent();

		if (!stu.isEmpty()) {
			for (Student s : stu) {
				System.out.println(s.getId());
				System.out.println(s.getName());
				System.out.println(s.getAge());
				System.out.println("---------------------------");
			}
		}
	}

}
