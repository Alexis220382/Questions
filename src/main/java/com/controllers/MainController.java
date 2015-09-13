package com.controllers;

import com.sssss.entity.Result;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/mine", method = RequestMethod.GET)
    public ModelAndView myTest(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Result result;

        if (request.getParameter("login") == null
                || request.getParameter("month") == null
                || request.getParameter("closeeyes") == null
                || request.getParameter("water") == null
                || request.getParameter("greenman") == null
                || request.getParameter("dayofweek") == null
                || request.getParameter("utensils") == null
                || request.getParameter("no") == null
                || request.getParameter("howmuch") == null) {
            modelAndView.setViewName("empty");
        } else {

            if (request.getParameter("month").equals("inallmonth")
                    && request.getParameter("closeeyes").equals("dreams")
                    && request.getParameter("water").equals("ice")
                    && request.getParameter("greenman").equals("gothrowroad")
                    && request.getParameter("dayofweek").equals("yeaterday")
                    && request.getParameter("utensils").equals("empty")
                    && request.getParameter("no").equals("alive")
                    && request.getParameter("howmuch").equals("six")) {

                result = new Result();
                result.setLogin(request.getParameter("login"));
                result.setQuestion1(request.getParameter("month"));
                result.setQuestion2(request.getParameter("closeeyes"));
                result.setQuestion3(request.getParameter("water"));
                result.setQuestion4(request.getParameter("greenman"));
                result.setQuestion5(request.getParameter("dayofweek"));
                result.setQuestion6(request.getParameter("utensils"));
                result.setQuestion7(request.getParameter("no"));
                result.setQuestion8(request.getParameter("howmuch"));
                result.setRes("ok");
                session.save(result);

                modelAndView.setViewName("result");
            } else {


                result = new Result();
                result.setLogin(request.getParameter("login"));
                result.setQuestion1(request.getParameter("month"));
                result.setQuestion2(request.getParameter("closeeyes"));
                result.setQuestion3(request.getParameter("water"));
                result.setQuestion4(request.getParameter("greenman"));
                result.setQuestion5(request.getParameter("dayofweek"));
                result.setQuestion6(request.getParameter("utensils"));
                result.setQuestion7(request.getParameter("no"));
                result.setQuestion8(request.getParameter("howmuch"));
                result.setRes("it's not ok");
                session.save(result);

                modelAndView.setViewName("resbad");
            }


        }

        tx.commit();
        session.close();

        return modelAndView;
    }

}