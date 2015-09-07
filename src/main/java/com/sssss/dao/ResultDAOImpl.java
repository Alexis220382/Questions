//package com.sssss.dao;
//
//import com.sssss.entity.Result;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate3.HibernateTemplate;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Repository("ResultDAO")
//@Transactional
//public class ResultDAOImpl implements ResultDAO {
//
//    private HibernateTemplate hibernateTemplate;
//
//    @Autowired
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        hibernateTemplate = new HibernateTemplate(sessionFactory);
//    }
//
//    @Transactional(readOnly = false)
//    public void saveResult(Result result) {
//        hibernateTemplate.saveOrUpdate(result);
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<Result> getAllResults(Result result) {
//        return (List<Result>) hibernateTemplate.find("from "
//                + Result.class.getName());
//    }
//
//    public Result getResultById(String id) {
//        return hibernateTemplate.get(Result.class, id);
//    }
//
//    @Transactional(readOnly = false)
//    public void deleteResult(Result result) {
//        hibernateTemplate.delete(result);
//    }
//}
