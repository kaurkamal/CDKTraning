package com.example.client;

import com.example.Dao.CourseDao;
import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");
        CourseDao courseDao = new CourseDao();
        //courseDao.save(managerFactory);
        //courseDao.read(managerFactory);
       // courseDao.update(managerFactory);
        //courseDao.delete(managerFactory);
        courseDao.newUpdate(managerFactory);
        managerFactory.close();

    }
}
