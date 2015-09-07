package com.controllers;

import com.sssss.dao.ResultDAO;
import com.sssss.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/mine", method = RequestMethod.GET)
    public ModelAndView myTest(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        ResultDAO dao = new ResultDAO();

        Result result = new Result();

        if (request.getParameter("month") != null
                && request.getParameter("month").equals("inallmonth")
                && request.getParameter("closeeyes") != null
                && request.getParameter("closeeyes").equals("dreams")
                && request.getParameter("water") != null
                && request.getParameter("water").equals("ice")
                && request.getParameter("greenman") != null
                && request.getParameter("greenman").equals("gothrowroad")
                && request.getParameter("dayofweek") != null
                && request.getParameter("dayofweek").equals("yeaterday")
                && request.getParameter("utensils") != null
                && request.getParameter("utensils").equals("empty")
                && request.getParameter("no") != null
                && request.getParameter("no").equals("alive")
                && request.getParameter("howmuch") != null
                && request.getParameter("howmuch").equals("six")) {
            dao.addResultDetails(request.getParameter("login"),
                    request.getParameter("month"),
                    request.getParameter("closeeyes"),
                    request.getParameter("water"),
                    request.getParameter("greenman"),
                    request.getParameter("dayofweek"),
                    request.getParameter("utensils"),
                    request.getParameter("no"),
                    request.getParameter("howmuch"),
                    "ok");
            modelAndView.setViewName("result");
        }else {
            dao.addResultDetails(request.getParameter("login"),
                    request.getParameter("month"),
                    request.getParameter("closeeyes"),
                    request.getParameter("water"),
                    request.getParameter("greenman"),
                    request.getParameter("dayofweek"),
                    request.getParameter("utensils"),
                    request.getParameter("no"),
                    request.getParameter("howmuch"),
                    "it's not ok");
            modelAndView.setViewName("resbad");
        }

        return modelAndView;
    }
}


