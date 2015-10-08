package com.controllers;

import com.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class MainController {

    Login login = null;
    Question1 question1 = null;
    Question2 question2 = null;
    Question3 question3 = null;
    Question4 question4 = null;
    Question5 question5 = null;
    Question6 question6 = null;
    Question7 question7 = null;
    Question8 question8 = null;


    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public ModelAndView myResult(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView();

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();



        if (request.getParameter("howmuch") != null){
            question8 = new Question8();
            question8.setDescription(request.getParameter("howmuch"));
            session.save(question8);
        }


            String name = (String) session.createQuery("SELECT description FROM Login").list().get(0);
            String month = (String) session.createQuery("SELECT description FROM Question1").list().get(0);
            String closeeyes = (String) session.createQuery("SELECT description FROM Question2").list().get(0);
            String water = (String) session.createQuery("SELECT description FROM Question3").list().get(0);
            String greenman = (String) session.createQuery("SELECT description FROM Question4").list().get(0);
            String dayofweek = (String) session.createQuery("SELECT description FROM Question5").list().get(0);
            String utensils = (String) session.createQuery("SELECT description FROM Question6").list().get(0);
            String no = (String) session.createQuery("SELECT description FROM Question7").list().get(0);
            String howmuch = (String) session.createQuery("SELECT description FROM Question8").list().get(0);

            Result result = null;

            if (name == null
                    || month == null
                    || closeeyes == null
                    || water == null
                    || greenman == null
                    || dayofweek == null
                    || utensils == null
                    || no == null
                    || howmuch == null) {
                modelAndView.setViewName("empty");
            } else {

                if (month.equals("inallmonth")
                        && closeeyes.equals("dreams")
                        && water.equals("ice")
                        && greenman.equals("gothrowroad")
                        && dayofweek.equals("yeaterday")
                        && utensils.equals("empty")
                        && no.equals("alive")
                        && howmuch.equals("six")) {

                    result = new Result();
                    result.setLogin(name);
                    result.setQuestion1(month);
                    result.setQuestion2(closeeyes);
                    result.setQuestion3(water);
                    result.setQuestion4(greenman);
                    result.setQuestion5(dayofweek);
                    result.setQuestion6(utensils);
                    result.setQuestion7(no);
                    result.setQuestion8(howmuch);
                    result.setRes("ok");

                    modelAndView.setViewName("result");
                } else {
                    result = new Result();
                    result.setLogin(name);
                    result.setQuestion1(month);
                    result.setQuestion2(closeeyes);
                    result.setQuestion3(water);
                    result.setQuestion4(greenman);
                    result.setQuestion5(dayofweek);
                    result.setQuestion6(utensils);
                    result.setQuestion7(no);
                    result.setQuestion8(howmuch);
                    result.setRes("it's not ok");

                    modelAndView.setViewName("resbad");
                }
            }

            session.save(result);

            session.delete(login);
            session.delete(question1);
            session.delete(question2);
            session.delete(question3);
            session.delete(question4);
            session.delete(question5);
            session.delete(question6);
            session.delete(question7);
            session.delete(question8);

        tx.commit();

        session.close();

        return modelAndView;
    }

    @RequestMapping(value = "/attribute", method = RequestMethod.GET)
    public ModelAndView myAttribute(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView();

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();


        if (request.getParameter("login") != null){
            login = new Login();
            login.setDescription(request.getParameter("login"));
            session.save(login);
        }
        if (request.getParameter("month") != null){
            question1 = new Question1();
            question1.setDescription(request.getParameter("month"));
            session.save(question1);
        }
        if (request.getParameter("closeeyes") != null){
            question2 = new Question2();
            question2.setDescription(request.getParameter("closeeyes"));
            session.save(question2);
        }
        if (request.getParameter("water") != null){
            question3 = new Question3();
            question3.setDescription(request.getParameter("water"));
            session.save(question3);
        }
        if (request.getParameter("greenman") != null){
            question4 = new Question4();
            question4.setDescription(request.getParameter("greenman"));
            session.save(question4);
        }
        if (request.getParameter("dayofweek") != null){
            question5 = new Question5();
            question5.setDescription(request.getParameter("dayofweek"));
            session.save(question5);
        }
        if (request.getParameter("utensils") != null){
            question6 = new Question6();
            question6.setDescription(request.getParameter("utensils"));
            session.save(question6);
        }
        if (request.getParameter("no") != null){
            question7 = new Question7();
            question7.setDescription(request.getParameter("no"));
            session.save(question7);
        }

        List questions = session.createQuery("SELECT description FROM Question").list();

        request.setAttribute("questions0", questions.get(0));
        request.setAttribute("questions1", questions.get(1));
        request.setAttribute("questions2", questions.get(2));
        request.setAttribute("questions3", questions.get(3));
        request.setAttribute("questions4", questions.get(4));
        request.setAttribute("questions5", questions.get(5));
        request.setAttribute("questions6", questions.get(6));
        request.setAttribute("questions7", questions.get(7));
        request.setAttribute("questions8", questions.get(8));

        modelAndView.setViewName("UseAjax");

        tx.commit();

        session.close();

        return modelAndView;
    }

}