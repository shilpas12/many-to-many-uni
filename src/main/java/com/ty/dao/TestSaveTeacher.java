package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Subject;
import com.ty.dto.Teacher;

public class TestSaveTeacher {

	public static void main(String[] args) {
		List<Subject> sub = new ArrayList<Subject>();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

//		Subject subject = new Subject();
//		subject.setName("Computer Science");
//		subject.setDays(60);
//		sub.add(subject);

//		Subject subject1 = new Subject();
//		subject1.setName("ADA");
//		subject1.setDays(80);
//		sub.add(subject1);

		Subject subject2 = new Subject();
		subject2.setName("English");
		subject2.setDays(30);
		sub.add(subject2);

		Subject subject3 = new Subject();
		subject3.setName("Kannada");
		subject3.setDays(35);
		sub.add(subject3);

		Teacher teacher = new Teacher();
		teacher.setName("sanvi");
		teacher.setAge(24);
		teacher.setSub(sub);
		
		Teacher teacher1 = new Teacher();
		teacher1.setName("shyam");
		teacher1.setAge(25);
		teacher1.setSub(sub);
		

		entityTransaction.begin();
//		entityManager.persist(subject);
//		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(subject3);
		entityManager.persist(teacher);
		entityManager.persist(teacher1);
		entityTransaction.commit();

		System.out.println("----------DATA STORED----------------");
	}

}
