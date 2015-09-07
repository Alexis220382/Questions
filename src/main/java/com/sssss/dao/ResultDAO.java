package com.sssss.dao;

import com.sssss.entity.Result;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.List;

//public interface ResultDAO {
//
//    public void saveResult(Result result);
//    public List<Result> getAllResults(Result result);
//    public Result getResultById(String id);
//    public void deleteResult(Result result);
//}

public class ResultDAO{

    public void addResultDetails(String login, String question1, String question2, String question3, String question4, String question5, String question6, String question7, String question8, String res){
        try{
            Configuration configuration = new Configuration().configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Result result = new Result();
            result.setLogin(login);
            result.setQuestion1(question1);
            result.setQuestion2(question2);
            result.setQuestion3(question3);
            result.setQuestion4(question4);
            result.setQuestion5(question5);
            result.setQuestion6(question6);
            result.setQuestion7(question7);
            result.setQuestion8(question8);
            result.setQuestion8(res);
            transaction.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }
}
