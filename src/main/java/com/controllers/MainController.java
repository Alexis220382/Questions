package com.controllers;

import com.entity.Result;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {


    @RequestMapping(value = "/mine", method = RequestMethod.GET)
    public ModelAndView myTest(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();


        Result result = null;

        if (request.getSession().getAttribute("login") == null
                || request.getSession().getAttribute("month") == null
                || request.getSession().getAttribute("closeeyes") == null
                || request.getSession().getAttribute("water") == null
                || request.getSession().getAttribute("greenman") == null
                || request.getSession().getAttribute("dayofweek") == null
                || request.getSession().getAttribute("utensils") == null
                || request.getSession().getAttribute("no") == null
                || request.getSession().getAttribute("howmuch") == null) {
            modelAndView.setViewName("empty");
        } else {

            if (request.getSession().getAttribute("month").equals("inallmonth")
                    && request.getSession().getAttribute("closeeyes").equals("dreams")
                    && request.getSession().getAttribute("water").equals("ice")
                    && request.getSession().getAttribute("greenman").equals("gothrowroad")
                    && request.getSession().getAttribute("dayofweek").equals("yeaterday")
                    && request.getSession().getAttribute("utensils").equals("empty")
                    && request.getSession().getAttribute("no").equals("alive")
                    && request.getSession().getAttribute("howmuch").equals("six")) {

                result = new Result();
                result.setLogin((String) request.getSession().getAttribute("login"));
                result.setQuestion1((String) request.getSession().getAttribute("month"));
                result.setQuestion2((String) request.getSession().getAttribute("closeeyes"));
                result.setQuestion3((String) request.getSession().getAttribute("water"));
                result.setQuestion4((String) request.getSession().getAttribute("greenman"));
                result.setQuestion5((String) request.getSession().getAttribute("dayofweek"));
                result.setQuestion6((String) request.getSession().getAttribute("utensils"));
                result.setQuestion7((String) request.getSession().getAttribute("no"));
                result.setQuestion8((String) request.getSession().getAttribute("howmuch"));
                result.setRes("ok");

                modelAndView.setViewName("result");
            } else {
                result = new Result();
                result.setLogin((String) request.getSession().getAttribute("login"));
                result.setQuestion1((String) request.getSession().getAttribute("month"));
                result.setQuestion2((String) request.getSession().getAttribute("closeeyes"));
                result.setQuestion3((String) request.getSession().getAttribute("water"));
                result.setQuestion4((String) request.getSession().getAttribute("greenman"));
                result.setQuestion5((String) request.getSession().getAttribute("dayofweek"));
                result.setQuestion6((String) request.getSession().getAttribute("utensils"));
                result.setQuestion7((String) request.getSession().getAttribute("no"));
                result.setQuestion8((String) request.getSession().getAttribute("howmuch"));
                result.setRes("it's not ok");

                modelAndView.setViewName("resbad");
            }
        }

//        Result result = null;
//
//        if (request.getParameter("login") == null
//                || request.getParameter("month") == null
//                || request.getParameter("closeeyes") == null
//                || request.getParameter("water") == null
//                || request.getParameter("greenman") == null
//                || request.getParameter("dayofweek") == null
//                || request.getParameter("utensils") == null
//                || request.getParameter("no") == null
//                || request.getParameter("howmuch") == null) {
//            modelAndView.setViewName("empty");
//        } else {
//
//            if (request.getParameter("month").equals("inallmonth")
//                    && request.getParameter("closeeyes").equals("dreams")
//                    && request.getParameter("water").equals("ice")
//                    && request.getParameter("greenman").equals("gothrowroad")
//                    && request.getParameter("dayofweek").equals("yeaterday")
//                    && request.getParameter("utensils").equals("empty")
//                    && request.getParameter("no").equals("alive")
//                    && request.getParameter("howmuch").equals("six")) {
//
//                result = new Result();
//                result.setLogin(request.getParameter("login"));
//                result.setQuestion1(request.getParameter("month"));
//                result.setQuestion2(request.getParameter("closeeyes"));
//                result.setQuestion3(request.getParameter("water"));
//                result.setQuestion4(request.getParameter("greenman"));
//                result.setQuestion5(request.getParameter("dayofweek"));
//                result.setQuestion6(request.getParameter("utensils"));
//                result.setQuestion7(request.getParameter("no"));
//                result.setQuestion8(request.getParameter("howmuch"));
//                result.setRes("ok");
//
//                modelAndView.setViewName("result");
//            } else {
//                result = new Result();
//                result.setLogin(request.getParameter("login"));
//                result.setQuestion1(request.getParameter("month"));
//                result.setQuestion2(request.getParameter("closeeyes"));
//                result.setQuestion3(request.getParameter("water"));
//                result.setQuestion4(request.getParameter("greenman"));
//                result.setQuestion5(request.getParameter("dayofweek"));
//                result.setQuestion6(request.getParameter("utensils"));
//                result.setQuestion7(request.getParameter("no"));
//                result.setQuestion8(request.getParameter("howmuch"));
//                result.setRes("it's not ok");
//
//                modelAndView.setViewName("resbad");
//            }
//        }

        session.save(result);
        tx.commit();

        session.close();

        return modelAndView;
    }

    @RequestMapping(value = "/asd", method = RequestMethod.GET)
    public ModelAndView myAjax(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        List list = new ArrayList();

        String login = (String) request.getSession().getAttribute("login");
        String month = (String) request.getSession().getAttribute("month");
        String closeeyes = (String) request.getSession().getAttribute("closeeyes");
        String water = (String) request.getSession().getAttribute("water");
        String greenman = (String) request.getSession().getAttribute("greenman");
        String dayofweek = (String) request.getSession().getAttribute("dayofweek");
        String utensils = (String) request.getSession().getAttribute("utensils");
        String no = (String) request.getSession().getAttribute("no");
        String howmuch = (String) request.getSession().getAttribute("howmuch");

        System.out.println(login+" "+month+" "+closeeyes+" "+water+" "+greenman+" "+dayofweek+" "+utensils+" "+no+" "+howmuch);

        if(request.getParameter("button9") != null) {
            Result result = null;

            if (login == null || month == null || closeeyes == null || water == null
                    || greenman == null || dayofweek == null || utensils == null
                    || no == null || howmuch == null) {
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
                    result.setLogin(login);
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
                    result.setLogin(login);
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
        } else {

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
        }
        tx.commit();


        session.close();


        return modelAndView;
    }

}