package com.example.Dao;

import com.example.entity.Course;

import javax.persistence.*;

public class CourseDao {
    public void save(EntityManagerFactory managerFactory) {
        Course course1 = new Course("database", 6, 78000.00);
        Course course2 = new Course("machinelearning", 7, 88000.00);
        Course course3 = new Course("java", 5, 98000.00);
        Course course4 = new Course("toc", 5, 18000.00);

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);
        entityManager.persist(course4);
        transaction.commit();

        entityManager.close();

    }

    public void read(EntityManagerFactory managerFactory) {

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Course course = entityManager.find(Course.class, 3);
        System.out.println(course);
        transaction.commit();

        entityManager.close();

    }

    public void update(EntityManagerFactory managerFactory) {


        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Course course = entityManager.find(Course.class, 3); //id=primaryKey
            course.setTitle("Spring");
            System.out.println(course);
            transaction.commit();
        } catch (PersistenceException e) {
            transaction.rollback();
        }

        entityManager.close();

    }

    public void delete(EntityManagerFactory managerFactory) {

        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Course course = entityManager.find(Course.class, 2);
        entityManager.remove(course);
        transaction.commit();

        entityManager.close();

    }

    public void newUpdate(EntityManagerFactory managerFactory) {
 Course c = new Course(1,"hybernate",2,7700.0); //directUpdate
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.merge(c);
        transaction.commit();

        entityManager.close();

    }

}
