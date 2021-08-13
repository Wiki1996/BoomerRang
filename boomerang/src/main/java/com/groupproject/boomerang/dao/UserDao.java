//package com.groupproject.boomerang.dao;
//
////import com.groupproject.boomerang.model.entity.User;
////import org.hibernate.Criteria;
//import com.groupproject.boomerang.model.entity.User;
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.criterion.Restrictions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class UserDao {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public void addUser(User user) {
//        Session session = null;
//
//        try {
//            session = sessionFactory.openSession();
//            session.beginTransaction();
//            session.save(user);
//            session.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            session.getTransaction().rollback();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public User getUserById (long id) {
//        User user = null;
//        try (Session session = sessionFactory.openSession()) {
//            Criteria criteria = session.createCriteria(User.class);
//            user = (User) criteria.add(Restrictions.eq("id", id)).uniqueResult();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return user;
//    }
//}
